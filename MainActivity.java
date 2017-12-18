package com.dolabellaapps.provaespecialandroid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private int positionX ;
    private int positionY ;
    private Context mContext;
    private Resources mResources;
    private RelativeLayout mRelativeLayout;
    private Button mButton;
    private ImageView mImageView;
    private EditText editText;
    private RadioButton normal;
    private RadioButton italico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);

        // Get the application context
        mContext = getApplicationContext();

        // Get the Resources
        mResources = getResources();

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mButton = (Button) findViewById(R.id.btn);
        mImageView = (ImageView) findViewById(R.id.imageView);

        // Set a click listener for Button widget
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                normal = (RadioButton)findViewById(R.id.normalRB);
                italico = (RadioButton)findViewById(R.id.italicoRB);
                if (editText.getText().length() == 0 ) {
                    Toast.makeText(MainActivity.this, "Texto em branco!", Toast.LENGTH_SHORT).show();
                }

                    // Initialize a new Bitmap
                Bitmap bitmap = Bitmap.createBitmap(
                        600, // Width
                        200, // Height
                        Bitmap.Config.ARGB_4444 // Config
                );

                // Initialize a new Canvas instance
                Canvas canvas = new Canvas(bitmap);

                // Initialize a new Paint instance to draw the text
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                // Set the text color
                paint.setColor(Color.BLACK);
                paint.setAntiAlias(true);


                // Set the text size
                paint.setTextSize(125);

                // Text alignment
                paint.setTextAlign(Paint.Align.CENTER);


                // Initialize a typeface object to draw text on canvas

                if(normal.isChecked() ) {
                    Typeface typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
                    paint.setTypeface(typeface);
                }else if(italico.isChecked()){
                    Typeface typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.ITALIC);
                    paint.setTypeface(typeface);
                }

                // calculate the y position of canvas to draw the text
                Rect rectangle = new Rect();

                paint.getTextBounds(
                        text, // text
                        0, // start
                        text.length(), // end
                        rectangle // bounds
                );

                //Finally, Draw the text on the canvas at the horizontal and vertical center position
                canvas.drawText(
                        text, // Text to draw
                        canvas.getWidth()/2, // x
                        canvas.getHeight()/2 + Math.abs(rectangle.height())/2, // y
                        paint // Paint
                );

                // Display the newly created bitmap on app interface
                mImageView.setImageBitmap(bitmap);
            }
        });
    }

        public void onClickClean(View view) {

            String text = editText.getText().toString();
            editText.setText("");

            Bitmap bitmap = Bitmap.createBitmap(
                    600, // Width
                    200, // Height
                    Bitmap.Config.ARGB_4444 // Config
            );

            // Initialize a new Canvas instance
            Canvas canvas = new Canvas(bitmap);
            mImageView.setImageBitmap(bitmap);

        }
    public void onClickItalic(View view) {
        String text = editText.getText().toString();
        normal = (RadioButton)findViewById(R.id.normalRB);
        italico = (RadioButton)findViewById(R.id.italicoRB);
        if (editText.getText().length() == 0 ) {
            Toast.makeText(MainActivity.this, "Texto em branco!", Toast.LENGTH_SHORT).show();
        }

        // Initialize a new Bitmap
        Bitmap bitmap = Bitmap.createBitmap(
                600, // Width
                200, // Height
                Bitmap.Config.ARGB_4444 // Config
        );

        // Initialize a new Canvas instance
        Canvas canvas = new Canvas(bitmap);

        // Initialize a new Paint instance to draw the text
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        // Set the text color
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);


        // Set the text size
        paint.setTextSize(125);

        // Text alignment
        paint.setTextAlign(Paint.Align.CENTER);


        // Initialize a typeface object to draw text on canvas

        Typeface typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.ITALIC);
        paint.setTypeface(typeface);

        // calculate the y position of canvas to draw the text
        Rect rectangle = new Rect();

        paint.getTextBounds(
                text, // text
                0, // start
                text.length(), // end
                rectangle // bounds
        );

        //Finally, Draw the text on the canvas at the horizontal and vertical center position
        canvas.drawText(
                text, // Text to draw
                canvas.getWidth()/2, // x
                canvas.getHeight()/2 + Math.abs(rectangle.height())/2, // y
                paint // Paint
        );

        // Display the newly created bitmap on app interface
        mImageView.setImageBitmap(bitmap);
    }


    public void onClickNormal(View view) {
        String text = editText.getText().toString();
        normal = (RadioButton)findViewById(R.id.normalRB);
        italico = (RadioButton)findViewById(R.id.italicoRB);
        if (editText.getText().length() == 0 ) {
            Toast.makeText(MainActivity.this, "Texto em branco!", Toast.LENGTH_SHORT).show();
        }

        // Initialize a new Bitmap
        Bitmap bitmap = Bitmap.createBitmap(
                600, // Width
                200, // Height
                Bitmap.Config.ARGB_4444 // Config
        );

        // Initialize a new Canvas instance
        Canvas canvas = new Canvas(bitmap);

        // Initialize a new Paint instance to draw the text
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        // Set the text color
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);


        // Set the text size
        paint.setTextSize(125);

        // Text alignment
        paint.setTextAlign(Paint.Align.CENTER);


        // Initialize a typeface object to draw text on canvas

        Typeface typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
        paint.setTypeface(typeface);

        // calculate the y position of canvas to draw the text
        Rect rectangle = new Rect();

        paint.getTextBounds(
                text, // text
                0, // start
                text.length(), // end
                rectangle // bounds
        );

        //Finally, Draw the text on the canvas at the horizontal and vertical center position
        canvas.drawText(
                text, // Text to draw
                canvas.getWidth()/2, // x
                canvas.getHeight()/2 + Math.abs(rectangle.height())/2, // y
                paint // Paint
        );

        // Display the newly created bitmap on app interface
        mImageView.setImageBitmap(bitmap);
    }
    }


