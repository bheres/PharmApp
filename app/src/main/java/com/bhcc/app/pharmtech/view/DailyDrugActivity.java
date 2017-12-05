package com.bhcc.app.pharmtech.view;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import com.bhcc.app.pharmtech.R;
import com.bhcc.app.pharmtech.data.MedicineLab;
import com.bhcc.app.pharmtech.data.model.Medicine;
import com.bhcc.app.pharmtech.view.navigation.ReplaceFragmentCommand;
import com.bhcc.app.pharmtech.view.study.CardActivity;
import com.bhcc.app.pharmtech.view.study.CardFrontFragment;

/**
 * Created by Bernard Heres on 11/27/2017.
 */

public class DailyDrugActivity extends AppCompatActivity {

    private MedicineLab mMedicineLab;
    private static final String EXTRA_MEDICINE_GENERIC_NAME = "extra: medicine generic name";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_card_front);
        //mMedicineLab = mMedicineLab.get(this);

      //  Medicine medicine = mMedicineLab.getRandomMedicine();
        Medicine medicine = new Medicine("name", "name","name", "name", "name",
                "name", "name");
//        ReplaceFragmentCommand.startNewFragment(this, CardFrontFragment.newInstance(medicine), false);
//        Intent intent = new Intent(this, CardActivity.class);
//        intent.putExtra(EXTRA_MEDICINE_GENERIC_NAME, medicine.getGenericName());
//        startActivity(intent);
//        finish();
    }
}
