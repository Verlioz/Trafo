package com.lineark.rafael.trafo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.Series;
import android.content.Intent;
import  android.view.View;

public class PA1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa1);

        TextView Compania = (TextView)findViewById(R.id.CompañiaE);

        Compania.setText(getIntent().getExtras().getString("data"));

        Button btnsig = (Button)findViewById(R.id.btnSig);

        GraphView graph = (GraphView) findViewById(R.id.graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 2),
                new DataPoint(3, 2),
                new DataPoint(10, 15),
                new DataPoint(4, 6)
        });
        series.setTitle("Random Curve 1");
        series.setColor(Color.GREEN);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        series.setThickness(5);

        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 2),
                new DataPoint(3, 2),
                new DataPoint(10, 15),
                new DataPoint(4, 6)
        });
        series1.setTitle("Random Curve 2");
        series1.setColor(Color.BLUE);
        series1.setDrawDataPoints(true);
        series1.setDataPointsRadius(10);
        series1.setThickness(5);

        graph.addSeries(series);
        graph.addSeries(series1);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-15);
        graph.getViewport().setMaxY(15);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(20);
// Scrolling     v
        //graph.getViewport().setScrollable(true);
        //graph.getViewport().setScrollableY(true);

        // Scalable
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);


    }


        public void onClick(View p) {
            Intent SIG = new Intent (this, PApruebas.class);

            startActivity(SIG);
        }
    }

