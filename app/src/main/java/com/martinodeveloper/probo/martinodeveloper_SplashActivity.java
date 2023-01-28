package com.martinodeveloper.probo;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.onesignal.OneSignal;
import com.martinodeveloper.probo.ai.martinodeveloper_Detail;
import com.martinodeveloper.probo.ai.martinodeveloper_data_new;
import com.martinodeveloper.probo.ai.martinodeveloper_upload;

public class martinodeveloper_SplashActivity extends AppCompatActivity {
    martinodeveloper_upload uploadClass;
    public String Splash = String.valueOf(getClass());
    public String TAG = String.valueOf(getClass());

    public static InterstitialAd interstitialAd1, interstitialAd2, interstitialAd3, interstitialAd4, interstitialAd5, interstitialAd6, interstitialAd7, interstitialAd8, interstitialAd9, interstitialAd10, interstitialAd11, interstitialAd12, interstitialAd13, interstitialAd14, interstitialAd15;

    private boolean Online() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.martinodeveloper_activity_splash);

        DatabaseReference key = FirebaseDatabase.getInstance().getReference("keyvalue");
        key.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                    if (onlineOnlineUploadData.appName.equalsIgnoreCase("probo")) {
                        // Enable verbose OneSignal logging to debug issues if needed.
                        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

                        // OneSignal Initialization
                        OneSignal.initWithContext(martinodeveloper_SplashActivity.this);
                        OneSignal.setAppId(uploadClass.getappopenkey1());

                        // promptForPushNotifications will show the native Android notification permission prompt.
                        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
                        OneSignal.promptForPushNotifications();
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        uploadClass = new martinodeveloper_upload(getApplicationContext());

        if (Online()) {

            DatabaseReference database3 = FirebaseDatabase.getInstance().getReference("Keys");
            database3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        martinodeveloper_Detail onlineOnlineUploadDetail = postSnapshot.getValue(martinodeveloper_Detail.class);
                        if (onlineOnlineUploadDetail.getAppName().equalsIgnoreCase("probo")) {

                            uploadClass.setFb_Ful1(onlineOnlineUploadDetail.getFbFullKey1());
                            uploadClass.setFb_Native1(onlineOnlineUploadDetail.getFbNativeKey1());
                            uploadClass.setFb_banner1(onlineOnlineUploadDetail.getFbBannerKey1());

                            uploadClass.setFb_Ful2(onlineOnlineUploadDetail.getFbFullKey2());
                            uploadClass.setFb_Native2(onlineOnlineUploadDetail.getFbNativeKey2());
                            uploadClass.setFb_banner2(onlineOnlineUploadDetail.getFbBannerKey2());

                            uploadClass.setFb_Ful3(onlineOnlineUploadDetail.getFbFullKey3());
                            uploadClass.setFb_Native3(onlineOnlineUploadDetail.getFbNativeKey3());
                            uploadClass.setFb_banner3(onlineOnlineUploadDetail.getFbBannerKey3());

                            uploadClass.setFb_Ful4(onlineOnlineUploadDetail.getFbFullKey4());
                            uploadClass.setFb_Native4(onlineOnlineUploadDetail.getFbNativeKey4());
                            uploadClass.setFb_banner4(onlineOnlineUploadDetail.getFbBannerKey4());

                            uploadClass.setFb_Ful5(onlineOnlineUploadDetail.getFbFullKey5());
                            uploadClass.setFb_Native5(onlineOnlineUploadDetail.getFbNativeKey5());
                            uploadClass.setFb_banner5(onlineOnlineUploadDetail.getFbBannerKey5());

                            uploadClass.setFb_Ful6(onlineOnlineUploadDetail.getFbFullKey6());
                            uploadClass.setFb_Native6(onlineOnlineUploadDetail.getFbNativeKey6());
                            uploadClass.setFb_banner6(onlineOnlineUploadDetail.getFbBannerKey6());

                            uploadClass.setFb_Ful7(onlineOnlineUploadDetail.getFbFullKey7());
                            uploadClass.setFb_Native7(onlineOnlineUploadDetail.getFbNativeKey7());
                            uploadClass.setFb_banner7(onlineOnlineUploadDetail.getFbBannerKey7());

                            uploadClass.setFb_Ful8(onlineOnlineUploadDetail.getFbFullKey8());
                            uploadClass.setFb_Native8(onlineOnlineUploadDetail.getFbNativeKey8());
                            uploadClass.setFb_banner8(onlineOnlineUploadDetail.getFbBannerKey8());

                            uploadClass.setFb_Ful9(onlineOnlineUploadDetail.getFbFullKey9());
                            uploadClass.setFb_Native9(onlineOnlineUploadDetail.getFbNativeKey9());
                            uploadClass.setFb_banner9(onlineOnlineUploadDetail.getFbBannerKey9());

                            uploadClass.setFb_Ful10(onlineOnlineUploadDetail.getFbFullKey10());
                            uploadClass.setFb_Native10(onlineOnlineUploadDetail.getFbNativeKey10());
                            uploadClass.setFb_banner10(onlineOnlineUploadDetail.getFbBannerKey10());

                            uploadClass.setFb_Ful11(onlineOnlineUploadDetail.getFbFullKey11());
                            uploadClass.setFb_Native11(onlineOnlineUploadDetail.getFbNativeKey11());
                            uploadClass.setFb_banner11(onlineOnlineUploadDetail.getFbBannerKey11());

                            uploadClass.setFb_Ful12(onlineOnlineUploadDetail.getFbFullKey12());
                            uploadClass.setFb_Native12(onlineOnlineUploadDetail.getFbNativeKey12());
                            uploadClass.setFb_banner12(onlineOnlineUploadDetail.getFbBannerKey12());

                            uploadClass.setFb_Ful13(onlineOnlineUploadDetail.getFbFullKey13());
                            uploadClass.setFb_Native13(onlineOnlineUploadDetail.getFbNativeKey13());
                            uploadClass.setFb_banner13(onlineOnlineUploadDetail.getFbBannerKey13());

                            uploadClass.setFb_Ful14(onlineOnlineUploadDetail.getFbFullKey14());
                            uploadClass.setFb_Native14(onlineOnlineUploadDetail.getFbNativeKey14());
                            uploadClass.setFb_banner14(onlineOnlineUploadDetail.getFbBannerKey14());

                            uploadClass.setFb_Ful15(onlineOnlineUploadDetail.getFbFullKey15());
                            uploadClass.setFb_Native15(onlineOnlineUploadDetail.getFbNativeKey15());
                            uploadClass.setFb_banner15(onlineOnlineUploadDetail.getFbBannerKey15());

                            uploadClass.setFb_Ful16(onlineOnlineUploadDetail.getFbFullKey16());
                            uploadClass.setFb_Native16(onlineOnlineUploadDetail.getFbNativeKey16());
                            uploadClass.setFb_banner16(onlineOnlineUploadDetail.getFbBannerKey16());

                            uploadClass.setFb_Ful17(onlineOnlineUploadDetail.getFbFullKey17());
                            uploadClass.setFb_Native17(onlineOnlineUploadDetail.getFbNativeKey17());
                            uploadClass.setFb_banner17(onlineOnlineUploadDetail.getFbBannerKey17());

                            uploadClass.setFb_Ful18(onlineOnlineUploadDetail.getFbFullKey18());
                            uploadClass.setFb_Native18(onlineOnlineUploadDetail.getFbNativeKey18());
                            uploadClass.setFb_banner18(onlineOnlineUploadDetail.getFbBannerKey18());

                            uploadClass.setFb_Ful19(onlineOnlineUploadDetail.getFbFullKey19());
                            uploadClass.setFb_Native19(onlineOnlineUploadDetail.getFbNativeKey19());
                            uploadClass.setFb_banner19(onlineOnlineUploadDetail.getFbBannerKey19());

                            uploadClass.setFb_Ful20(onlineOnlineUploadDetail.getFbFullKey20());
                            uploadClass.setFb_Native20(onlineOnlineUploadDetail.getFbNativeKey20());
                            uploadClass.setFb_banner20(onlineOnlineUploadDetail.getFbBannerKey20());

                            uploadClass.setFb_Ful21(onlineOnlineUploadDetail.getFbFullKey21());
                            uploadClass.setFb_Native21(onlineOnlineUploadDetail.getFbNativeKey21());
                            uploadClass.setFb_banner21(onlineOnlineUploadDetail.getFbBannerKey21());

                            uploadClass.setFb_Ful22(onlineOnlineUploadDetail.getFbFullKey22());
                            uploadClass.setFb_Native22(onlineOnlineUploadDetail.getFbNativeKey22());
                            uploadClass.setFb_banner22(onlineOnlineUploadDetail.getFbBannerKey22());

                            uploadClass.setFb_Ful23(onlineOnlineUploadDetail.getFbFullKey23());
                            uploadClass.setFb_Native23(onlineOnlineUploadDetail.getFbNativeKey23());
                            uploadClass.setFb_banner23(onlineOnlineUploadDetail.getFbBannerKey23());

                            uploadClass.setFb_Ful24(onlineOnlineUploadDetail.getFbFullKey24());
                            uploadClass.setFb_Native24(onlineOnlineUploadDetail.getFbNativeKey24());
                            uploadClass.setFb_banner24(onlineOnlineUploadDetail.getFbBannerKey24());

                            uploadClass.setFb_Ful25(onlineOnlineUploadDetail.getFbFullKey25());
                            uploadClass.setFb_Native25(onlineOnlineUploadDetail.getFbNativeKey25());
                            uploadClass.setFb_banner25(onlineOnlineUploadDetail.getFbBannerKey25());

                            uploadClass.setFb_Ful26(onlineOnlineUploadDetail.getFbFullKey26());
                            uploadClass.setFb_Native26(onlineOnlineUploadDetail.getFbNativeKey26());
                            uploadClass.setFb_banner26(onlineOnlineUploadDetail.getFbBannerKey26());

                            uploadClass.setFb_Ful27(onlineOnlineUploadDetail.getFbFullKey27());
                            uploadClass.setFb_Native27(onlineOnlineUploadDetail.getFbNativeKey27());
                            uploadClass.setFb_banner27(onlineOnlineUploadDetail.getFbBannerKey27());

                            uploadClass.setFb_Ful28(onlineOnlineUploadDetail.getFbFullKey28());
                            uploadClass.setFb_Native28(onlineOnlineUploadDetail.getFbNativeKey28());
                            uploadClass.setFb_banner28(onlineOnlineUploadDetail.getFbBannerKey28());

                            uploadClass.setFb_Ful29(onlineOnlineUploadDetail.getFbFullKey29());
                            uploadClass.setFb_Native29(onlineOnlineUploadDetail.getFbNativeKey29());
                            uploadClass.setFb_banner29(onlineOnlineUploadDetail.getFbBannerKey29());

                            uploadClass.setFb_Ful30(onlineOnlineUploadDetail.getFbFullKey30());
                            uploadClass.setFb_Native30(onlineOnlineUploadDetail.getFbNativeKey30());
                            uploadClass.setFb_banner30(onlineOnlineUploadDetail.getFbBannerKey30());


                            uploadClass.setappopenkey1(onlineOnlineUploadDetail.getappopenkey1());
                            uploadClass.setappopenkey2(onlineOnlineUploadDetail.getappopenkey2());
                            uploadClass.setappopenkey3(onlineOnlineUploadDetail.getappopenkey3());
                            uploadClass.setappopenkey4(onlineOnlineUploadDetail.getappopenkey4());
                            uploadClass.setappopenkey5(onlineOnlineUploadDetail.getappopenkey5());
                            uploadClass.setappopenkey6(onlineOnlineUploadDetail.getappopenkey6());
                            uploadClass.setappopenkey7(onlineOnlineUploadDetail.getappopenkey7());
                            uploadClass.setappopenkey8(onlineOnlineUploadDetail.getappopenkey8());
                            uploadClass.setappopenkey9(onlineOnlineUploadDetail.getappopenkey9());
                            uploadClass.setappopenkey10(onlineOnlineUploadDetail.getappopenkey10());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey11());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey12());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey13());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey14());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey15());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey16());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey17());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey18());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey19());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey20());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey21());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey22());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey23());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey24());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey25());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey26());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey27());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey28());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey29());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey30());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey31());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey32());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey33());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey34());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey35());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey36());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey37());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey38());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey39());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey40());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey41());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey42());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey43());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey44());
                            uploadClass.setappopenkey11(onlineOnlineUploadDetail.getappopenkey45());


                        }
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Log.d(TAG,"Err "+databaseError.getMessage());
                }
            });



            DatabaseReference keys = FirebaseDatabase.getInstance().getReference("keyvalue");
            keys.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {

                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                        if (onlineOnlineUploadData.appName.equalsIgnoreCase("probo")) {
                            try {
                                if (onlineOnlineUploadData.value.equalsIgnoreCase("1")) {

                                } else if (onlineOnlineUploadData.value.equalsIgnoreCase("2")) {
                                    loadFullscreenad();
                                }

                            } catch (Exception e) {

                            }
                        }
                    }

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

            DatabaseReference keys1 = FirebaseDatabase.getInstance().getReference("Upload");
            keys1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    boolean isNext = true;

                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                        if (onlineOnlineUploadData.appName.equalsIgnoreCase("probo")) {
                            try {
                                if (onlineOnlineUploadData.value.equalsIgnoreCase("1")) {
                                    showUpdate(onlineOnlineUploadData.getAppLink());

                                    isNext = false;

                                }
                            } catch (Exception e) {

                            }
                        }
                    }
                    if (isNext == true) {
                        NextScreen();
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });


        } else {
            NextScreen();
        }
    }
    private void NextScreen() {

        Handler hndler= new Handler();
        hndler.postDelayed(new Runnable() {
            @Override
            public void run() {

                DatabaseReference keys1 = FirebaseDatabase.getInstance().getReference("keyvalue");
                keys1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot snapshot) {


                        for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                            martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                            if (onlineOnlineUploadData.appName.equalsIgnoreCase("probo")) {
                                try {
                                    if (onlineOnlineUploadData.value2.equalsIgnoreCase("123")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_start_page.class));

                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("13")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_start_page.class));

                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("12")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_start_page.class));
                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("1")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_start_page.class));
                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("2")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_Next.class));
                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("3")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_Get_start_Activity.class));
                                    }
                                    else if (onlineOnlineUploadData.value2.equalsIgnoreCase("23")) {
                                        martinodeveloper_SplashActivity.this.startActivity(new Intent(martinodeveloper_SplashActivity.this, martinodeveloper_Next.class));
                                    }

                                } catch (Exception e) {

                                }
                            }
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        },5000);


    }

    void showUpdate(final String str) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.martinodeveloper_newapp);
        dialog.setCancelable(false);
        TextView textView = (TextView) dialog.findViewById(R.id.tvNo);
        ((TextView) dialog.findViewById(R.id.tvYes)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                startActivity(intent);
                dialog.dismiss();
                finish();
                dialog.cancel();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setGravity(80);
        dialog.show();
    }

    public void loadFullscreenad() {
        interstitialAd1 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful16());
        Log.e(TAG, "fbfull16 " + uploadClass.getFb_Ful16());
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e("1", "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd1.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 16 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }

        };
        interstitialAd1.loadAd(
                interstitialAd1.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
///////////////

        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful17());
        Log.e(TAG, "fbfull17 " + uploadClass.getFb_Ful17());

        InterstitialAdListener interstitialAdListener2 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd2.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 17 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd2.loadAd(
                interstitialAd2.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener2)
                        .build());
        //////////
        interstitialAd3 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful18());
        Log.e(TAG, "fbfull18 " + uploadClass.getFb_Ful18());

        InterstitialAdListener interstitialAdListener3 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd3.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 18 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd3.loadAd(
                interstitialAd3.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener3)
                        .build());


        interstitialAd4 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful19());
        Log.e(TAG, "fbfull19 " + uploadClass.getFb_Ful19());

        InterstitialAdListener interstitialAdListener4 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd4.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 19 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd4.loadAd(
                interstitialAd4.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener4)
                        .build());
        //////
        interstitialAd5 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful20());
        Log.e(TAG, "fbfull20 " + uploadClass.getFb_Ful20());

        InterstitialAdListener interstitialAdListener5 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd5.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 20 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd5.loadAd(
                interstitialAd5.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener5)
                        .build());
        /////
        interstitialAd6 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful21());
        Log.e(TAG, "fbfull21 " + uploadClass.getFb_Ful21());
        InterstitialAdListener interstitialAdListener6 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd6.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 21 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd6.loadAd(
                interstitialAd6.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener6)
                        .build());
///////////////
        interstitialAd7 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful22());
        Log.e(TAG, "fbfull22 " + uploadClass.getFb_Ful22());
        InterstitialAdListener interstitialAdListener7 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd7.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 22 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd7.loadAd(
                interstitialAd7.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener7)
                        .build());
/////
        interstitialAd8 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful23());
        Log.e(TAG, "fbfull23 " + uploadClass.getFb_Ful23());
        InterstitialAdListener interstitialAdListener8 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd8.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 23 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd8.loadAd(
                interstitialAd8.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener8)
                        .build());


        /////
        interstitialAd9 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful24());
        Log.e(TAG, "fbfull24 " + uploadClass.getFb_Ful24());
        InterstitialAdListener interstitialAdListener9 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd9.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 24 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd9.loadAd(
                interstitialAd9.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener9)
                        .build());

        /////
        interstitialAd10 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful25());
        Log.e(TAG, "fbfull25 " + uploadClass.getFb_Ful25());
        InterstitialAdListener interstitialAdListener10 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd10.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 25 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd10.loadAd(
                interstitialAd10.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener10)
                        .build());

        /////
        interstitialAd11 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful26());
        Log.e(TAG, "fbfull26 " + uploadClass.getFb_Ful26());
        InterstitialAdListener interstitialAdListener11 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd11.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 26 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd11.loadAd(
                interstitialAd11.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener11)
                        .build());


        /////
        interstitialAd12 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful27());
        Log.e(TAG, "fbfull27 " + uploadClass.getFb_Ful27());
        InterstitialAdListener interstitialAdListener12 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd12.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 27 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd12.loadAd(
                interstitialAd12.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener12)
                        .build());


        interstitialAd13 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful28());
        Log.e(TAG, "fbfull28 " + uploadClass.getFb_Ful28());
        InterstitialAdListener interstitialAdListener13 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "fbfull 28 " +"Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "fbfull 28 " +"Interstitial ad dismissed.");
                interstitialAd13.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 28 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "fbfull 28 " +"Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "fbfull 28 " +"Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "fbfull 28 " +"Interstitial ad impression logged!");
            }
        };
        interstitialAd13.loadAd(
                interstitialAd13.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener13)
                        .build());


        interstitialAd14 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful29());
        Log.e(TAG, "fbfull29 " + uploadClass.getFb_Ful29());
        InterstitialAdListener interstitialAdListener14 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "Interstitial ad dismissed.");
                interstitialAd14.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 29 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "Interstitial ad impression logged!");
            }
        };
        interstitialAd14.loadAd(
                interstitialAd14.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener14)
                        .build());


        interstitialAd15 = new com.facebook.ads.InterstitialAd(this, uploadClass.getFb_Ful30());
        Log.e(TAG, "fbfull30 " + uploadClass.getFb_Ful30());
        InterstitialAdListener interstitialAdListener15 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(Splash, "fbfull 30 " + "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(Splash, "fbfull 30 " + "Interstitial ad dismissed.");
                interstitialAd15.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(Splash, "fbfull 30 " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(Splash, "fbfull 30 " + "Interstitial ad is loaded and ready to be displayed!");

            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(Splash, "fbfull 30 " + "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(Splash, "fbfull 30 " + "Interstitial ad impression logged!");
            }
        };
        interstitialAd15.loadAd(
                interstitialAd15.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener15)
                        .build());
    }


}