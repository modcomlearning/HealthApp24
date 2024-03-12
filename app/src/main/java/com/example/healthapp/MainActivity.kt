package com.example.healthapp
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Code Here
        //We Find the Cards using their IDs.
        //Each card will Navigate to its Specfic Activity/Page.
        val about = findViewById<CardView>(R.id.cardabout)
        about.setOnClickListener {
            //TODO Explicit Intent to an AboutActivity
            val intent = Intent(applicationContext, AboutActivity::class.java)
            startActivity(intent)

        }//end

        val causes = findViewById<CardView>(R.id.cardcauses)
        causes.setOnClickListener {
            //TODO Explicit Intent to a CausestActivity
            val intent = Intent(applicationContext, CausesActivity::class.java)
            startActivity(intent)
        }//end

        val prevention = findViewById<CardView>(R.id.cardprevention)
        prevention.setOnClickListener {
            //TODO Explicit Intent to a PreventionActivity
            val intent = Intent(applicationContext, PreventionActivity::class.java)
            startActivity(intent)
        }//end


        val symptoms = findViewById<CardView>(R.id.cardsymptoms)
        symptoms.setOnClickListener {
            //TODO Explicit Intent to a SymptomsActivity
            val intent = Intent(applicationContext, SymptomsActivity::class.java)
            startActivity(intent)
        }//end

        val tollfree = findViewById<CardView>(R.id.cardtollfree)
        tollfree.setOnClickListener {
             //TODO Explicit Intent to a TollfreeActivity
            val intent = Intent(applicationContext, TollFreeActivity::class.java)
            startActivity(intent)
        }//end

        val locate = findViewById<CardView>(R.id.cardlocate)
        locate.setOnClickListener {
            //TODO Explicit Intent to a LocationActivity
            val intent = Intent(applicationContext, LocationActivity::class.java)
            startActivity(intent)

        }//end

    }
}