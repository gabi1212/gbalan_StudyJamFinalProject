package com.studyjams.gbalan.fiveprotocolbtherapy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Protocol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocol);
    }
    int bColoana=0,bTiroida=0,bAntistress=0,bOboseala=0,bADHD=0;
    public void submitColoana(View view) {
        ///metoda pentru protocol Coloana Vertebrala
        String message;
        if(bColoana%2==0) {
            message = "\t 1. BRM-uri cum suporta \n\t 2. Rinichi \n\t 3. Popliteu, SacrumPronat" +
                    "\n\t 4. Plv, Sacrum \n\t 5. Popl, Gen, GDDM, Plv, Sacrum" +
                    "\n\t 6. 1(1-10), 2(1-4,9-16), Rinichi, \n\t 7. PTE \n\t 8. PLV, Sacrum" +
                    "\n\t 9. Plv, Sacrum \n\t10. 1(1-10), Coccis\n\t11. 1(1-10), CoccisOblic" +
                    "\n\t12. Rinichi, 3(1-8) \n\t13. Resp, VB\n\t14. Rinichi, Resp, VB, 3" +
                    "\n\t15. Rinichi, Resp, VB, PSOAS \n\t16. Resp, VB, PLV, PSOAS\n\t" +
                    "17. Rinichi, Resp, VB, PLV, PSOAS \n\t18. RotundMare,Umar, N, S, E, V" +
                    "\n\t19. TL, TRS+TMJ\n\t20. TL, Piept, TRS+TMJ\n\t21.TL, Piept, TRS+TMJav" +
                    "\n\t22. Toracica2 (Resp, 3(1,3,2,4 - stg dureros),HTL)\n\t23. Sternala" +
                    "\n\t24. Rinichi-mini, Sternala-mini\n\t25. Sternala, TRS+TMJav (pacient insotit)"+
                    "\n\t26. Coccis, TRS+TMJ, Cap(pacient insotit)";
            bColoana=1;
        }
        else
        {
            message="scolioza, cifoza, alte probleme";
            bColoana=0;
        }
        TextView ColoanaTextView = (TextView) findViewById(R.id.ColoanaTextView);
        ColoanaTextView.setText(message);
    }

    public void submitTiroida(View view) {
        String message;
        if(bTiroida==0)
        { message="\t 1. BRM-uri cum suporta \n\t 2. Rinichi \n\t 3. 1(1-4)PelvisLimfatic, Sacrum"+
                "\n\t 4. 1(1-4)PelvisLimfatic, Sacrum \n\t 5. Rinichi\n\t 6. Resp, VB, RotundMare, Umar \n\t"+
                " 7. Rinichi, Resp, VB\n\t 8. TL, Piept, RotunMare, Umar, CIMA\n\t 9. TL, TRS+TMJ\n\t"+
                "10. Piept, TL, TRS+TMJ\n\t"+
                "11.  Resp, VB, TL, TRS+TMJ\n\t12. TL, TRS+TMJav \n\t13. 1(1-2), Coccis\n\t14. 1(1-2), CoccisOblic \n\t"+
                "15. 1(1-2), HRT\n\t16. 1(1-2), Coccis(1), HRT, Cap\n\t17. 1(1-2), Coccis, TL, TRS+TMJ, Cap";
            bTiroida=1;
        }
        else
        {
            message="hiper, hipo, orice problema";
            bTiroida=0;
        }
        TextView TiroidaTextView = (TextView) findViewById(R.id.TiroidaTextView);
        TiroidaTextView.setText(message);
    }


    public void submitAntistress(View view) {
        String message;
        if(bAntistress==0)
        { message="\t1. BRM-uri cum suporta \n\t2. Rinichi (stress, tensiune, manie)\n\t3. Genunchi (stress)"+
                "\n\t4. Popliteu (depresii)\n\t5. Resp, VB (tristete, durere sufleteasca, depresie)"+
                "\n\t6. Piept (descarcare emotionala)\n\t7. TRS+TMJ (stress)\n\t8. Umar (stress)"+
                "\n\t9. Vest (descarcare emotionala) \n\t10. CIMA (stress, descarcare emotionala)\n\t11. Cap";

            bAntistress=1;
        }
        else
        {
            message="";
            bAntistress=0;
        }
        TextView AntistressTextView = (TextView) findViewById(R.id.AntistressTextView);
        AntistressTextView.setText(message);
    }
    public void submitOboseala(View view) {
        //creare text pentru textView-ul ObosealaTextView
        String message;
        if(bOboseala==0) {
            message = "\t 1. BRM-uri cum suporta \n\t 2. Rinichi, Genunchi \n\t 3. Resp, VB" +
                    "\n\t 4. Rinichi, Resp, VB \n\t 5. TL, TRS+TMJ\n\t 6. Genunchi, Umar,CIMA \n\t" +
                    " 7. Popliteu, Genunchi, GDDM, VB\n\t 8. Pelvis, Sacrum\n\t 9.Popliteu, Genunchi, Pelvis, Sacrum\n" +
                    "\t10. Coccis, Genunchi, GDDM\n\t11. Rinichi, PTE\n\t12. Reflex la Genunchi, Arsura la calcai\n" +
                    "\t13. Popliteu, Pelvis, Gracillis, Sacrum\n\t14. Popliteu, Coccis oblic\n" +
                    "\t15. Sternala\n\t16. Sternala, TL, TRS+TMJav\n\t17. Coccis, TRS+TMJ, Cap\n";
            bOboseala=1;
        }
        else
        {
            message="Dureri musculare si oboseala cronica";
            bOboseala=0;
        }
        TextView ObosealaTextView = (TextView) findViewById(R.id.ObosealaTextView);
        ObosealaTextView.setText(message);
    }

    public void submitADHD(View view) {

        String message;
        if(bADHD==0)
        {
            message="\t 1. BRM-uri cum suporta \n\t 2. Rinichi \n\t 3. Pelvis, Sacrum"+
                    "\n\t 4. Pelvis, Sacrum \n\t 5. Popliteu, Genunchi, Pelvis, Sacrum\n\t"+
                    " 6. Popliteu, SacrumPronat, Genunchi, Pelvis\n\t" +
                    " 7. PTE, Pelvis, Gracilis\n\t 8. Rinichi, Resp(3-5), VB minime\n\t"+
                    " 9. Rinichi, Resp, VB\n\t10. Resp, VB, TL, Piept\n\t11. TL, TRS+TMJ, Cap\n\t"+
                    "12. TL, TRS+TMJav, Cap \n\t13. Resp, VB, TL, TRS+TMJ, Cap\n\t"+
                    "14. TL, Piept, N, S, E, V (fara testari)\n\t15. Umar, CIMA\n\t16. Sternala, Cap\n\t"+
                    "17. Coccis, Cap\n\t18. CoccisOblic, CAp \n\t19. Sternala, TRS+TMJ, Cap\n\t"+
                    "20. Coccis, TL, TRS+TMJ, Cap";
            bADHD=1;
        }
        else
        {
            message="probleme de atentie, comportament, etc";
            bADHD=0;
        }
        TextView ADHDTextView = (TextView) findViewById(R.id.ADHDTextView);
        ADHDTextView.setText(message);
    }

}
