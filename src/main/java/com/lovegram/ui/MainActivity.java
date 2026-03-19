// Original Content
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // New Interactive UI Elements
        Button interactiveButton = new Button(this);
        interactiveButton.setText("Click Me!");
        interactiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Interactive action, e.g., show a message
                Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(interactiveButton);
    }
}
