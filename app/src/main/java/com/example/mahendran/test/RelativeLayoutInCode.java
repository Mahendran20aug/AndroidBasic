package com.example.mahendran.test;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;

public class RelativeLayoutInCode extends Activity {

    RelativeLayout main;
    EditText userNameValue, passwordValue;
    TextView message, userName, password;
    LayoutParams messageDimensions,userNameDimensions,
            userNameValueDimensions,passwordDimensions,
            passwordValueDimensions,loginButtonDimensions;
    Button login;
    int messageId=1,userNameId=2,userNameValueId=3,passwordId=4,passwordValueId=5,loginId=6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        createMessageTextView();
        createUserNameTextView();
        createUserValueNameEditText();
        createPassWordTextView();
        createPassWordValueEditText();
        createLoginButton();
        main.addView(message, messageDimensions);
        main.addView(userName, userNameDimensions);
        main.addView(userNameValue, userNameValueDimensions);
        main.addView(password, passwordDimensions);
        main.addView(passwordValue, passwordValueDimensions);
        main.addView(login, loginButtonDimensions);
        setContentView(main);
    }

    private void init() {
        main=new RelativeLayout(this);
        LayoutParams mainDimensions=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);

        userNameValue=new EditText(this);
        passwordValue=new EditText(this);
        message=new TextView(this);
        userName=new TextView(this);
        password=new TextView(this);
        login=new Button(this);
    }
    private void createMessageTextView() {
        messageDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        messageDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        message.setText("Please login first");
        message.setId(messageId=1);
        message.setLayoutParams(messageDimensions);
    }
    private void createUserNameTextView() {
        userNameDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        userNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        userNameDimensions.addRule(RelativeLayout.BELOW,messageId);
        password.setGravity(Gravity.RIGHT);
        userName.setText("User Name");
        userName.setId(userNameId=2);
        userName.setLayoutParams(userNameDimensions);
    }
    private void createUserValueNameEditText() {
        userNameValueDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        userNameValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        userNameValueDimensions.addRule(RelativeLayout.BELOW,messageId);
        userNameValueDimensions.addRule(RelativeLayout.RIGHT_OF,userNameId);
        userNameValueDimensions.addRule(RelativeLayout.ALIGN_BASELINE,userNameId);
        userNameValue.setId(userNameValueId=3);

    }
    private void createPassWordTextView() {
        passwordDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        passwordDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        passwordDimensions.addRule(RelativeLayout.BELOW,userNameId);
        passwordDimensions.addRule(RelativeLayout.ALIGN_RIGHT, userNameId);
        password.setGravity(Gravity.RIGHT);
        password.setText("PassWord");
        password.setId(passwordId=4);
        password.setLayoutParams( passwordDimensions);
    }
    private void createPassWordValueEditText() {
        passwordValueDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        passwordValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        passwordValueDimensions.addRule(RelativeLayout.BELOW,userNameValueId);
        passwordValueDimensions.addRule(RelativeLayout.RIGHT_OF,passwordId);
        passwordValueDimensions.addRule(RelativeLayout.ALIGN_BASELINE,passwordId);
        password.setId(passwordValueId=5);
        password.setLayoutParams(passwordValueDimensions);

    }
    private void createLoginButton() {
        loginButtonDimensions=new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        loginButtonDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        loginButtonDimensions.addRule(RelativeLayout.BELOW,passwordValueId);
        login.setId(loginId=6);
        login.setText("Login");

    }

}




