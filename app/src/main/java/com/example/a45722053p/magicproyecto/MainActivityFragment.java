package com.example.a45722053p.magicproyecto;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public final Integer vidas = 20;
    public final Integer veneno = 0;

    public Integer vidas1 = vidas;
    public Integer vidas2 = vidas;
    public Integer veneno1 = veneno;
    public Integer veneno2 = veneno;

    Button btnvidauparriba, btnvidadownarriba, btnvenenouparriba, btnvenenodownarriba, btnvidaupabajo,
            btnvidadownabajo, btnvenenoupabajo, btnvenenodownabajo, btntransferarriba, btntransferabajo;
    TextView textovidasarriba, textovenenoarriba, textovidasabajo, textovenenoabajo;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View FragmentView = inflater.inflate(R.layout.fragment_main, container, false);

        //Aquí enlazamos los botones con los del layout y los textos.
        btnvidauparriba = (Button) FragmentView.findViewById(R.id.btn_vidaplusup);
        btnvidadownarriba = (Button) FragmentView.findViewById(R.id.btn_vidaminusup);
        btnvenenouparriba = (Button) FragmentView.findViewById(R.id.btn_venplusup);
        btnvenenodownarriba = (Button) FragmentView.findViewById(R.id.btn_venminusup);

        btnvidaupabajo = (Button) FragmentView.findViewById(R.id.btn_vidaplusdown);
        btnvidadownabajo = (Button) FragmentView.findViewById(R.id.btn_vidaminusdown);
        btnvenenoupabajo = (Button) FragmentView.findViewById(R.id.btn_venenoplusdown);
        btnvenenodownabajo = (Button) FragmentView.findViewById(R.id.btn_venenominusdown);

        btntransferarriba = (Button) FragmentView.findViewById(R.id.trasnferup);
        btntransferabajo = (Button) FragmentView.findViewById(R.id.transferdown);

        textovidasarriba = (TextView) FragmentView.findViewById(R.id.textoVidaarriba);
        textovenenoarriba = (TextView) FragmentView.findViewById(R.id.TextoVenenoArriba);
        textovidasabajo = (TextView) FragmentView.findViewById(R.id.textoVidaAbajo);
        textovenenoabajo = (TextView) FragmentView.findViewById(R.id.textoVenenoAbajo);

        textovidasarriba.setText(vidas1.toString());
        textovidasabajo.setText(vidas2.toString());
        textovenenoarriba.setText(veneno1.toString());
        textovenenoabajo.setText(veneno2.toString());


        //A continuación pondremos los listeners de los botones de la parte superior.

        btnvidauparriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas1++;
                textovidasarriba.setText(vidas1.toString());

            }
        });

        btnvidadownarriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas1--;
                textovidasarriba.setText(vidas1.toString());

            }
        });

        btnvenenouparriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                veneno1++;
                textovenenoarriba.setText(veneno1.toString());

            }
        });

        btnvenenodownarriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                veneno1--;
                textovenenoarriba.setText(veneno1.toString());

            }
        });


        btntransferarriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas1++;
                vidas2--;
                textovidasarriba.setText(vidas1.toString());
                textovidasabajo.setText(vidas2.toString());

            }
        });

        //Aquí a continuación pondremos los listeners de los botones de la parte inferior.

        btnvidaupabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas2++;
                textovidasabajo.setText(vidas2.toString());

            }
        });

        btnvidadownabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas2--;
                textovidasabajo.setText(vidas2.toString());

            }
        });


        btnvenenoupabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                veneno2++;
                textovenenoabajo.setText(veneno2.toString());

            }
        });

        btnvenenodownabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                veneno2--;
                textovenenoabajo.setText(veneno2.toString());

            }
        });

        btntransferabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vidas1--;
                vidas2++;
                textovidasarriba.setText(vidas1.toString());
                textovidasabajo.setText(vidas2.toString());

            }
        });

        return FragmentView;
    }
}
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
//        inflater.inflate(R.menu.menu_pelis_fragment, menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_refresh) {
//            refresh();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


