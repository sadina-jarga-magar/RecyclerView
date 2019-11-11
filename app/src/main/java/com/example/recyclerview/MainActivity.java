package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<president> lstPresident;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        lstPresident = new ArrayList<> ();

        lstPresident.add(new president("Gerald Ford","Gerald Rudolph Ford Jr. (born Leslie Lynch King Jr.; July 14, 1913 – December 26, 2006) was an American politician who served as the 38th president of the United States from August 1974 to January 1977.",R.drawable.gerald));
        lstPresident.add(new president ("Jimmy Carter","James Earl Carter Jr. (born October 1, 1924) is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party, he previously served as a Georgia State Senator from 1963 to 1967 and as the 76th Governor of Georgia from 1971 to 1975.",R.drawable.jimmy));
        lstPresident.add(new president ("Ronald Wilson","Ronald Wilson. ... Sir Ronald Darling Wilson, AC KBE CMG QC (23 August 1922 – 15 July 2005) was a distinguished Australian lawyer, judge and social activist serving on the High Court of Australia between 1979 and 1989 and as the President of the Human Rights and Equal Opportunity Commission between 1990 and 1997.",R.drawable.ronald));
        lstPresident.add(new president ("George H.W.Bush","George Herbert Walker Bush (June 12, 1924 – November 30, 2018) was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989.",R.drawable.georgehw));
        lstPresident.add(new president("Gerald Ford","Gerald Rudolph Ford Jr. (born Leslie Lynch King Jr.; July 14, 1913 – December 26, 2006) was an American politician who served as the 38th president of the United States from August 1974 to January 1977.",R.drawable.gerald));
        lstPresident.add(new president ("Jimmy Carter","James Earl Carter Jr. (born October 1, 1924) is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party, he previously served as a Georgia State Senator from 1963 to 1967 and as the 76th Governor of Georgia from 1971 to 1975.",R.drawable.jimmy));
        lstPresident.add(new president ("Ronald Wilson","Ronald Wilson. ... Sir Ronald Darling Wilson, AC KBE CMG QC (23 August 1922 – 15 July 2005) was a distinguished Australian lawyer, judge and social activist serving on the High Court of Australia between 1979 and 1989 and as the President of the Human Rights and Equal Opportunity Commission between 1990 and 1997.",R.drawable.ronald));
        lstPresident.add(new president ("George H.W.Bush","George Herbert Walker Bush (June 12, 1924 – November 30, 2018) was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989.",R.drawable.georgehw));


        RecyclerView myrv= (RecyclerView) findViewById (R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter (this,lstPresident);
        myrv.setLayoutManager (new GridLayoutManager (this,2));
        myrv.setAdapter (myAdapter);

    }
}
