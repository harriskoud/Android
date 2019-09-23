package com.koud.quotes.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.koud.quotes.R
import com.koud.quotes.data.Quote
import com.koud.quotes.data.QuotesViewModel
import com.koud.quotes.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_main.*


class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUi()
    }



        fun initializeUi(){

            val factory = InjectorUtils.provideQuotesViewModelFactory()
            val viewModel = ViewModelProviders.of(this,factory).get(QuotesViewModel::class.java)

            viewModel.getQuotes().observe(this, Observer { quotes ->
                val stringBuilder = StringBuilder()
                quotes.forEach { quote ->
                    stringBuilder.append("$quote\n\n")
                }
                textView_quotes.text = stringBuilder.toString()
            })

            // When button is clicked, instantiate a Quote and add it to DB through the ViewModel
            button_add_quote.setOnClickListener {
                val quote = Quote(editText_quote.text.toString(), editText_author.text.toString())
                viewModel.addQuote(quote)
                editText_quote.setText("")
                editText_author.setText("")
            }


    }
}
