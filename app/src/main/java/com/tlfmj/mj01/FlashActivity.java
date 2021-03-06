package com.tlfmj.mj01;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.mj.utils.activity.BaseFlashActivity;
import com.mj.utils.call.JWConlseCallback;
import com.mj.utils.tools.GetDateUtils;

/**
 * Created by Dmytro Denysenko on 5/4/15.
 */
public class FlashActivity extends BaseFlashActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mj_activity_flash);
      /*  initJW(new JWConlseCallback() {
            @Override
            public void reload() {
                reReload();
            }

            @Override
            public void home() {
                startActivity(new Intent(mContext, MainActivity.class));
            }
        });
*/
        initCountDown();
    }

    @Override
    protected void initCountDown() {
        new CountDownTimer(3000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(mContext, MainActivity.class));
            }
        }.start();

    }


    @Override
    public String getURL() {
   /*     String DOMAIN_NAME = "http://tow.caiqiqi08.com/Lottery_server/get_init_data.php?type=android&appid=";
        String ID = "237573041358";
//        String ID = "test";
        return DOMAIN_NAME + ID;*/
        return "terM444I";
    }

    private void reReload() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Snackbar.make(FlashActivity.this.getWindow().getDecorView().findViewById(android.R.id.content),
                        "网络错误，请重新加载", Snackbar.LENGTH_INDEFINITE).setAction("重新加载", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        GetDateUtils.getMJHJWUrl(mContext, getURL(), new JWConlseCallback() {
                            @Override
                            public void reload() {

                            }

                            @Override
                            public void home() {
                                startActivity(new Intent(mContext, MainActivity.class));
                            }
                        });
                    }
                }).setActionTextColor(getResources().getColor(R.color.black)).show();
            }
        });
    }


    @Override
    public void countDownTimerResult() {
        startActivity(new Intent(mContext, MainActivity.class));
    }
}
