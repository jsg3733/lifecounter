package jgs3733.washington.edu.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    private int P1Life;
    private int P2Life;
    private int P3Life;
    private int P4Life;
    static final String P1 = "Player 1";
    static final String P2 = "Player 2";
    static final String P3 = "Player 3";
    static final String P4 = "Player 4";
    static final String GameState = "State of Game";
    private String WhoLost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            P1Life = savedInstanceState.getInt(P1);
            P2Life = savedInstanceState.getInt(P2);
            P3Life = savedInstanceState.getInt(P3);
            P4Life = savedInstanceState.getInt(P4);
            WhoLost = savedInstanceState.getString(GameState);
            ((TextView)findViewById(R.id.textP1Life)).setText("" + P1Life);
            ((TextView)findViewById(R.id.textP2Life)).setText("" + P2Life);
            ((TextView)findViewById(R.id.textP3Life)).setText("" + P3Life);
            ((TextView)findViewById(R.id.textP4Life)).setText("" + P4Life);
            ((TextView)findViewById(R.id.PlayerLoses)).setText("" + WhoLost);
        }else {
            P1Life = 20;
            P2Life = 20;
            P3Life = 20;
            P4Life = 20;
            WhoLost = "";
        }
        //player one listeners
        Button btnPlayerOnePlusOne = (Button) findViewById(R.id.btnP1Plus1);
        btnPlayerOnePlusOne.setOnClickListener(btnListener);
        Button btnPlayerOneSubOne = (Button) findViewById(R.id.btnP1Sub1);
        btnPlayerOneSubOne.setOnClickListener(btnListener);
        Button btnPlayerOnePlusFive = (Button) findViewById(R.id.btnP1Plus5);
        btnPlayerOnePlusFive.setOnClickListener(btnListener);
        Button btnPlayerOneSubFive = (Button) findViewById(R.id.btnP1Sub5);
        btnPlayerOneSubFive.setOnClickListener(btnListener);
        //player two listeners
        Button btnPlayerTwoPlusOne = (Button) findViewById(R.id.btnP2Plus1);
        btnPlayerTwoPlusOne.setOnClickListener(btnListener);
        Button btnPlayerTwoSubOne = (Button) findViewById(R.id.btnP2Sub1);
        btnPlayerTwoSubOne.setOnClickListener(btnListener);
        Button btnPlayerTwoPlusFive = (Button) findViewById(R.id.btnP2Plus5);
        btnPlayerTwoPlusFive.setOnClickListener(btnListener);
        Button btnPlayerTwoSubFive = (Button) findViewById(R.id.btnP2Sub5);
        btnPlayerTwoSubFive.setOnClickListener(btnListener);
        //player three listeners
        Button btnPlayerThreePlusOne = (Button) findViewById(R.id.btnP3Plus1);
        btnPlayerThreePlusOne.setOnClickListener(btnListener);
        Button btnPlayerThreeSubOne = (Button) findViewById(R.id.btnP3Sub1);
        btnPlayerThreeSubOne.setOnClickListener(btnListener);
        Button btnPlayerThreePlusFive = (Button) findViewById(R.id.btnP3Plus5);
        btnPlayerThreePlusFive.setOnClickListener(btnListener);
        Button btnPlayerThreeSubFive = (Button) findViewById(R.id.btnP3Sub5);
        btnPlayerThreeSubFive.setOnClickListener(btnListener);
        //player four listeners
        Button btnPlayerFourPlusOne = (Button) findViewById(R.id.btnP4Plus1);
        btnPlayerFourPlusOne.setOnClickListener(btnListener);
        Button btnPlayerFourSubOne = (Button) findViewById(R.id.btnP4Sub1);
        btnPlayerFourSubOne.setOnClickListener(btnListener);
        Button btnPlayerFourPlusFive = (Button) findViewById(R.id.btnP4Plus5);
        btnPlayerFourPlusFive.setOnClickListener(btnListener);
        Button btnPlayerFourSubFive = (Button) findViewById(R.id.btnP4Sub5);
        btnPlayerFourSubFive.setOnClickListener(btnListener);


    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                // player 1 cases
                case R.id.btnP1Plus1:
                    P1Life++;
                    ((TextView)findViewById(R.id.textP1Life)).setText("" + P1Life);
                    break;
                case R.id.btnP1Sub1:
                    P1Life--;
                    ((TextView)findViewById(R.id.textP1Life)).setText("" + P1Life);
                    if(P1Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 1 LOSES!");
                    }
                    break;
                case R.id.btnP1Plus5:
                    P1Life += 5;
                    ((TextView)findViewById(R.id.textP1Life)).setText("" + P1Life);
                    break;
                case R.id.btnP1Sub5:
                    P1Life -= 5;
                    ((TextView)findViewById(R.id.textP1Life)).setText("" + P1Life);
                    if(P1Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 1 LOSES!");
                    }
                    break;
                 // player 2 cases
                case R.id.btnP2Plus1:
                    P2Life++;
                    ((TextView)findViewById(R.id.textP2Life)).setText("" + P2Life);
                    break;
                case R.id.btnP2Sub1:
                    P2Life--;
                    ((TextView)findViewById(R.id.textP2Life)).setText("" + P2Life);
                    if(P2Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 2 LOSES!");
                    }
                    break;
                case R.id.btnP2Plus5:
                    P2Life += 5;
                    ((TextView)findViewById(R.id.textP2Life)).setText("" + P2Life);
                    break;
                case R.id.btnP2Sub5:
                    P2Life -= 5;
                    ((TextView)findViewById(R.id.textP2Life)).setText("" + P2Life);
                    if(P2Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 2 LOSES!");
                    }
                    break;
                // player 3 cases
                case R.id.btnP3Plus1:
                    P3Life++;
                    ((TextView)findViewById(R.id.textP3Life)).setText("" + P3Life);
                    break;
                case R.id.btnP3Sub1:
                    P3Life--;
                    ((TextView)findViewById(R.id.textP3Life)).setText("" + P3Life);
                    if(P3Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 3 LOSES!");
                    }
                    break;
                case R.id.btnP3Plus5:
                    P3Life += 5;
                    ((TextView)findViewById(R.id.textP3Life)).setText("" + P3Life);
                    break;
                case R.id.btnP3Sub5:
                    P3Life -= 5;
                    ((TextView)findViewById(R.id.textP3Life)).setText("" + P3Life);
                    if(P3Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 3 LOSES!");
                    }
                    break;
                // player 4 cases
                case R.id.btnP4Plus1:
                    P4Life++;
                    ((TextView)findViewById(R.id.textP4Life)).setText("" + P4Life);
                    break;
                case R.id.btnP4Sub1:
                    P4Life--;
                    ((TextView)findViewById(R.id.textP4Life)).setText("" + P4Life);
                    if(P4Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 4 LOSES!");
                    }
                    break;
                case R.id.btnP4Plus5:
                    P4Life += 5;
                    ((TextView)findViewById(R.id.textP4Life)).setText("" + P4Life);
                    break;
                case R.id.btnP4Sub5:
                    P4Life -= 5;
                    ((TextView)findViewById(R.id.textP4Life)).setText("" + P4Life);
                    if(P4Life <= 0) {
                        ((TextView)findViewById(R.id.PlayerLoses)).setText("Player 4 LOSES!");
                    }
                    break;




            }
        }
    };


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

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(P1, P1Life);
        savedInstanceState.putInt(P2, P2Life);
        savedInstanceState.putInt(P3, P3Life);
        savedInstanceState.putInt(P4, P4Life);
        WhoLost = (String) ((TextView)findViewById(R.id.PlayerLoses)).getText();
        savedInstanceState.putString(GameState, WhoLost);
        // Save the heirarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
}
