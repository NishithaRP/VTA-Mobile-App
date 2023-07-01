package com.example.vta_courses

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class course : AppCompatActivity() {
    private lateinit var ict5data:TextView
    private lateinit var ict5area:LinearLayout

    private lateinit var ict4data:TextView
    private lateinit var ict4area:LinearLayout

    private lateinit var ictharddata:TextView
    private lateinit var icthardarea:LinearLayout


    private lateinit var dpdata:TextView
    private lateinit var dparea:LinearLayout

    private lateinit var etdata:TextView
    private lateinit var etarea:LinearLayout

    private lateinit var emdata:TextView
    private lateinit var emarea:LinearLayout

    private lateinit var afdata:TextView
    private lateinit var afarea:LinearLayout

    private lateinit var bkdata:TextView
    private lateinit var bkarea:LinearLayout

    private lateinit var ckdata:TextView
    private lateinit var ckarea:LinearLayout



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        ict5data=findViewById(R.id.ict5_details)
        ict5area=findViewById(R.id.ict5_layout)

        ict4data=findViewById(R.id.ict4_details)
        ict4area=findViewById(R.id.ict4_layout)

        ictharddata=findViewById(R.id.ict4h_details)
        icthardarea=findViewById(R.id.ict4h_layout)

        dpdata=findViewById(R.id.dp_details)
        dparea=findViewById(R.id.dp_layout)

        etdata=findViewById(R.id.et_details)
        etarea=findViewById(R.id.et_layout)

        emdata=findViewById(R.id.em_details)
        emarea=findViewById(R.id.em_layout)

        afdata=findViewById(R.id.af_details)
        afarea=findViewById(R.id.af_layout)

        bkdata=findViewById(R.id.bk_details)
        bkarea=findViewById(R.id.bk_layout)

        ckdata=findViewById(R.id.ck_details)
        ckarea=findViewById(R.id.ck_layout)

    }

    fun expandict5(view: View) {

        val ict5Visibility = if (ict5data.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(ict5area, AutoTransition())
        ict5data.visibility=ict5Visibility

    }

    fun expandict4(view: View) {

        val ict4Visibility =if (ict4data.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(ict4area, AutoTransition())
        ict4data.visibility=ict4Visibility
    }

    fun expandict4h(view: View) {

        val ictHVisibility =if (ictharddata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(icthardarea, AutoTransition())
        ictharddata.visibility=ictHVisibility
    }
    fun expanddp(view: View) {

        val dpVisibility =if (dpdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(dparea, AutoTransition())
        dpdata.visibility=dpVisibility


    }

    fun expandet(view: View) {

        val etVisibility =if (etdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(etarea, AutoTransition())
        etdata.visibility=etVisibility


    }

    fun expandem(view: View) {

        val emVisibility =if (emdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(emarea, AutoTransition())
        emdata.visibility=emVisibility


    }

    fun expandaf(view: View) {

        val afVisibility =if (afdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(afarea, AutoTransition())
        afdata.visibility=afVisibility


    }

    fun expandbk(view: View) {

        val bkVisibility =if (bkdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(bkarea, AutoTransition())
        bkdata.visibility=bkVisibility


    }

    fun expandck(view: View) {

        val ckVisibility =if (ckdata.visibility == View.GONE) View.VISIBLE else View.GONE

        TransitionManager.beginDelayedTransition(ckarea, AutoTransition())
        ckdata.visibility=ckVisibility

    }


}