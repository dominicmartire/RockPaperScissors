package user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rockBtn;
    Button paperBtn;
    Button scissorsBtn;
    TextView computerChoice;
    TextView resultTxt;
    TextView txtUserChoice;
    TextView numWins;
    TextView numLosses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        computerChoice = (TextView)findViewById(R.id.computerChoice);
        resultTxt = (TextView)findViewById(R.id.resultTxt);
        txtUserChoice = (TextView)findViewById(R.id.txtUserChoice);
        numWins = (TextView)findViewById(R.id.numWins);
        numLosses = (TextView)findViewById(R.id.numLosses);

        rockBtn = (Button)findViewById(R.id.rockBtn);
        paperBtn = (Button)findViewById(R.id.paperBtn);
        scissorsBtn = (Button)findViewById(R.id.scissorsBtn);

        final RockPaperScissorsV1 rps = new RockPaperScissorsV1();

        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userChoice = "rock";
                String compChoice = rps.makeCompChoice();
                String endResult = rps.playGame(compChoice, userChoice);
                String result = rps.getResults();
                computerChoice.setText(compChoice);
                txtUserChoice.setText(userChoice);
                resultTxt.setText(result);
                numWins.setText(rps.numWins());
                numLosses.setText(rps.numLosses());
            }
        });

        paperBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String userChoice = "paper";
                String compChoice = rps.makeCompChoice();
                String endResult = rps.playGame(compChoice, userChoice);
                String result = rps.getResults();
                computerChoice.setText(compChoice);
                txtUserChoice.setText(userChoice);
                resultTxt.setText(result);
                numWins.setText(rps.numWins());
                numLosses.setText(rps.numLosses());
            }
        });

        scissorsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String userChoice = "scissors";
                String compChoice = rps.makeCompChoice();
                String endResult = rps.playGame(compChoice, userChoice);
                String result = rps.getResults();
                computerChoice.setText(compChoice);
                txtUserChoice.setText(userChoice);
                resultTxt.setText(result);
                numWins.setText(rps.numWins());
                numLosses.setText(rps.numLosses());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
