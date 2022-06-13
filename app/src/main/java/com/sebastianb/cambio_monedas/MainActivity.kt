package com.sebastianb.cambio_monedas

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Spinner
import com.sebastianb.cambio_monedas.databinding.ActivityMainBinding
import java.text.DecimalFormat
import kotlin.math.roundToInt

class MainActivity : Activity() {

    private lateinit var mainBinding: ActivityMainBinding  //Declaramos pero no la inicializamos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        val view= mainBinding.root
        setContentView(view)


        mainBinding.button.setOnClickListener {
            val dec=DecimalFormat("###,###,###,###,###,###,###.##")
            var resultado=dec.format(0.00)
            val moneda1: Spinner = findViewById(R.id.moneda_edit_spinner)
            val moneda11 = moneda1.selectedItem.toString()
            val moneda2: Spinner = findViewById(R.id.moneda_edit_spinner2)
            val moneda22 = moneda2.selectedItem.toString()
            val valor1 = mainBinding.valor1EditText.text.toString()

            if (moneda11=="Pesos Colombianos"||moneda11=="Colombian Pesos" && moneda22 == "Pesos Colombianos"||moneda22 == "Colombian Pesos"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }

            if (moneda11=="Dolar" && moneda22 == "Dolar"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }

            if (moneda11=="Pesos Mexicanos" && moneda22 == "Pesos Mexicanos"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Euro" && moneda22 == "Euro"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }

            if (moneda11=="Pesos Colombianos" && moneda22 == "Dolar"){
                 resultado = dec.format(valor1.toFloat()*0.00026)
                 mainBinding.infoTextView2.text=getString(R.string.dolar)
            }

            if(moneda11=="Pesos Colombianos"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.00025)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Pesos Colombianos"&&moneda22=="Pesos Mexicanos"){
                resultado= dec.format(valor1.toFloat()*0.0052)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Pesos Mexicanos" && moneda22 == "Dolar"){
                resultado = dec.format(valor1.toFloat()*0.051)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }
            if(moneda11=="Pesos Mexicanos"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.048)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Pesos Mexicanos"&&moneda22=="Pesos Colombianos"){
                resultado=dec.format(valor1.toFloat()*192.91)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }

            if (moneda11=="Dolar" && moneda22 == "Pesos Colombianos"){
                resultado = dec.format(valor1.toFloat()*3802.00)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }
            if(moneda11=="Dolar"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.94)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Dolar"&&moneda22=="Pesos Mexicanos"){
                resultado=dec.format(valor1.toFloat()*19.71)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Euro" && moneda22 == "Pesos Colombianos"){
                resultado = dec.format(valor1.toFloat()*4049.81)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }

            if(moneda11=="Euro"&& moneda22=="Dolar"){
                resultado=dec.format(valor1.toFloat()*1.07)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }
            if(moneda11=="Euro"&&moneda22=="Pesos Mexicanos"){
                resultado=dec.format(valor1.toFloat()*21.00)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }
            if (moneda11=="Dollar" && moneda22 == "Dollar"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }

            if (moneda11=="Mexican Pesos" && moneda22 == "Mexican Pesos"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Euro" && moneda22 == "Euro"){
                resultado = dec.format(valor1.toFloat()*1)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }

            if (moneda11=="Colombian Pesos" && moneda22 == "Dollar"){
                resultado = dec.format(valor1.toFloat()*0.00026)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }

            if(moneda11=="Colombian Pesos"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.00025)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Colombian Pesos"&&moneda22=="Mexican Pesos"){
                resultado= dec.format(valor1.toFloat()*0.0052)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Mexican Pesos" && moneda22 == "Dollar"){
                resultado = dec.format(valor1.toFloat()*0.051)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }
            if(moneda11=="Mexican Pesos"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.048)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Mexican Pesos"&&moneda22=="Colombian Pesos"){
                resultado=dec.format(valor1.toFloat()*192.91)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }

            if (moneda11=="Dollar" && moneda22 == "Colombian Pesos"){
                resultado = dec.format(valor1.toFloat()*3802.00)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }
            if(moneda11=="Dollar"&& moneda22=="Euro"){
                resultado=dec.format(valor1.toFloat()*0.94)
                mainBinding.infoTextView2.text=getString(R.string.euro)
            }
            if(moneda11=="Dollar"&&moneda22=="Mexican Pesos"){
                resultado=dec.format(valor1.toFloat()*19.71)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            if (moneda11=="Euro" && moneda22 == "Colombian Pesos"){
                resultado = dec.format(valor1.toFloat()*4049.81)
                mainBinding.infoTextView2.text=getString(R.string.peso)
            }

            if(moneda11=="Euro"&& moneda22=="Dollar"){
                resultado=dec.format(valor1.toFloat()*1.07)
                mainBinding.infoTextView2.text=getString(R.string.dolar)
            }
            if(moneda11=="Euro"&&moneda22=="Mexican Pesos"){
                resultado=dec.format(valor1.toFloat()*21.00)
                mainBinding.infoTextView2.text=getString(R.string.pesom)
            }

            val resultadof = resultado.toString()
            mainBinding.infoTextView.text = resultadof


        }
    }
}