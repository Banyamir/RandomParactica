package com.example.aplicacionp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

  //Declaramos variables
     ImageView cajaDeImagen;
     int s=1;
      int Dif=0; //agregamos solo una variable para que muestre la diferencia y no se repita al
                  //valor que nos arroja el Random
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       cajaDeImagen=(ImageView) findViewById(R.id.imageView);
    }

    //Nuestro metodo que USAREMOS
    public void pulsarBoton(View view){
//en el caso que sea igual seguira repitiendo el metodo del boton(Random)
if(s==Dif){
    pulsarBoton(view);
}else {
    //en caso de que el valor sea diferente se mostrará el siguiente valor random
    Random s = new Random();

    int cambioNumero = s.nextInt(11) + 1;


    //CUANDO SE VCUMPLA LA CONDICION MOSTRARA UNA CAJA DE IMAGENES

    if (cambioNumero == 1) {
        cajaDeImagen.setImageResource(R.drawable.uno);
    } else if (cambioNumero == 2) {
        cajaDeImagen.setImageResource(R.drawable.dos);
    } else if (cambioNumero == 3) {
        cajaDeImagen.setImageResource(R.drawable.tres);
    } else if (cambioNumero == 4) {
        cajaDeImagen.setImageResource(R.drawable.cuatro);
    } else if (cambioNumero == 5) {
        cajaDeImagen.setImageResource(R.drawable.cinco);
    } else if (cambioNumero == 6) {
        cajaDeImagen.setImageResource(R.drawable.seis);
    } else if (cambioNumero == 7) {
        cajaDeImagen.setImageResource(R.drawable.siete);
    } else if (cambioNumero == 8) {
        cajaDeImagen.setImageResource(R.drawable.ocho);
    } else if (cambioNumero == 9) {
        cajaDeImagen.setImageResource(R.drawable.nueve);
    } else if (cambioNumero == 10) {
        cajaDeImagen.setImageResource(R.drawable.dies);
    } else if (cambioNumero == 11) {
        cajaDeImagen.setImageResource(R.drawable.once);
    }


}
    }
}

