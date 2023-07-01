package com.example.vta_courses

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class center : AppCompatActivity() {

    private lateinit var npdata: TextView
    private lateinit var nparea: LinearLayout

    private lateinit var hvtcdata: TextView
    private lateinit var hvtcarea: LinearLayout

    private lateinit var wldata: TextView
    private lateinit var wlarea: LinearLayout

    private lateinit var aldata: TextView
    private lateinit var alarea: LinearLayout

    private lateinit var kndata: TextView
    private lateinit var knarea: LinearLayout

    private lateinit var vsdata: TextView
    private lateinit var vsarea: LinearLayout

    private lateinit var mgdata: TextView
    private lateinit var mgarea: LinearLayout

    private lateinit var pndata: TextView
    private lateinit var pnarea: LinearLayout

    private lateinit var bndata: TextView
    private lateinit var bnarea: LinearLayout

    private lateinit var indata: TextView
    private lateinit var inarea: LinearLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_center)

        npdata=findViewById(R.id.np_details)
        nparea=findViewById(R.id.np_layout)

        hvtcdata=findViewById(R.id.hvtc_details)
        hvtcarea=findViewById(R.id.hvtc_layout)

        wldata=findViewById(R.id.wl_details)
        wlarea=findViewById(R.id.wl_layout)

        aldata=findViewById(R.id.al_details)
        alarea=findViewById(R.id.al_layout)

        kndata=findViewById(R.id.kn_details)
        knarea=findViewById(R.id.kn_layout)

        vsdata=findViewById(R.id.vs_details)
        vsarea=findViewById(R.id.vs_layout)

        mgdata=findViewById(R.id.mg_details)
        mgarea=findViewById(R.id.mg_layout)

        pndata=findViewById(R.id.pn_details)
        pnarea=findViewById(R.id.pn_layout)

        bndata=findViewById(R.id.bn_details)
        bnarea=findViewById(R.id.bn_layout)

        indata=findViewById(R.id.in_details)
        inarea=findViewById(R.id.in_layout)

    }

    fun expandnp(view: View) {

        val npVisibility = if (npdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(nparea, AutoTransition())
        npdata.visibility=npVisibility

    }
    fun expandhvtc(view: View) {

        val hvtcVisibility = if (hvtcdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(hvtcarea, AutoTransition())
        hvtcdata.visibility=hvtcVisibility

    }

    fun expandwl(view: View) {

        val wlVisibility = if (wldata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(wlarea, AutoTransition())
        wldata.visibility=wlVisibility

    }
    fun expandal(view: View) {

        val alVisibility = if (aldata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(alarea, AutoTransition())
        aldata.visibility=alVisibility

    }
    fun expandkn(view: View) {


        val knVisibility = if (kndata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(knarea, AutoTransition())
        kndata.visibility=knVisibility

    }
    fun expandvs(view: View) {

        val vsVisibility = if (vsdata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(vsarea, AutoTransition())
        vsdata.visibility=vsVisibility
    }

    fun expandmg(view: View) {

        val mgVisibility = if (mgdata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(mgarea, AutoTransition())
        mgdata.visibility=mgVisibility
    }
    fun expandpn(view: View) {

        val pnVisibility = if (pndata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(pnarea, AutoTransition())
        pndata.visibility=pnVisibility
    }
    fun expandbn(view: View) {

        val bnVisibility = if (bndata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(bnarea, AutoTransition())
        bndata.visibility=bnVisibility
    }
    fun expandin(view: View) {

        val inVisibility = if (indata.visibility == View.GONE) View.VISIBLE else View.GONE
        TransitionManager.beginDelayedTransition(inarea, AutoTransition())
        indata.visibility=inVisibility
    }

}