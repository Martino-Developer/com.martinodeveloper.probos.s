package com.martinodeveloper.probo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.martinodeveloper.probo.ai.martinodeveloper_data_new;
import com.martinodeveloper.probo.ai.martinodeveloper_upload;

import java.util.ArrayList;
import java.util.List;

public class martinodeveloper_Get_start_Activity extends AppCompatActivity {
    TextView imageButton, share, more, rate;
    ImageView Q_1, Q_2;
    martinodeveloper_upload uploadClass;
    private com.facebook.ads.AdView bannerAdContainer;
    LinearLayout adView1, L1, L2;
    FrameLayout nativeAdContainer;
    FrameLayout frameLayout;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    public String TAG = String.valueOf(getClass());

    private com.google.android.gms.ads.AdView mAdView;
    private UnifiedNativeAd gnativeAd;
    private com.google.android.gms.ads.InterstitialAd gInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.martinodeveloper_activity_get_start);

        L1 = findViewById(R.id.L1);
        L2 = findViewById(R.id.L2);

        martinodeveloper_start_page.url_passing(martinodeveloper_Get_start_Activity.this);
        martinodeveloper_start_page.url_passing1(martinodeveloper_Get_start_Activity.this);

        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                martinodeveloper_start_page.url_passing(martinodeveloper_Get_start_Activity.this);
                martinodeveloper_start_page.url_passing1(martinodeveloper_Get_start_Activity.this);

            }
        });
        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                martinodeveloper_start_page.url_passing(martinodeveloper_Get_start_Activity.this);
                martinodeveloper_start_page.url_passing1(martinodeveloper_Get_start_Activity.this);

            }
        });
        uploadClass = new martinodeveloper_upload(getApplicationContext());

        DatabaseReference keys = FirebaseDatabase.getInstance().getReference("keyvalue");
        keys.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                    if (onlineOnlineUploadData.appName.equalsIgnoreCase("probos")) {
                        try {
                            if (onlineOnlineUploadData.value.equalsIgnoreCase("1")) {


                            } else if (onlineOnlineUploadData.value.equalsIgnoreCase("2")) {
                                loadfbNativeAd();
                                showfbbanner();
                                ShowFullAds();

                            } else if (onlineOnlineUploadData.value.equalsIgnoreCase("3")) {

                                showgbanner();
                                loadgFull();
                                loadgNativeAd();

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

        ((ImageView) findViewById(R.id.start)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_MainActivity.class);
                startActivity(i);

            }
        });

        ((ImageView) findViewById(R.id.start_1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_MainActivity.class);
                startActivity(i);

            }
        });
    }

    public void onBackPressed() {
        DatabaseReference keys1 = FirebaseDatabase.getInstance().getReference("keyvalue");
        keys1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    martinodeveloper_data_new onlineOnlineUploadData = postSnapshot.getValue(martinodeveloper_data_new.class);
                    if (onlineOnlineUploadData.appName.equalsIgnoreCase("probos")) {
                        try {
                            if (onlineOnlineUploadData.value3.equalsIgnoreCase("456")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_Exit.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("46")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_Exit.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("45")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_Exit.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("4")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_Exit.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("5")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_more.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("6")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_Thank_you.class));
                            } else if (onlineOnlineUploadData.value3.equalsIgnoreCase("56")) {
                                martinodeveloper_Get_start_Activity.this.startActivity(new Intent(martinodeveloper_Get_start_Activity.this, martinodeveloper_more.class));
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

    public static void inflateAd(NativeAd nativeAd, View adView, final Context context) {
        MediaView nativeAdIcon = (MediaView) adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
        TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
        MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
        TextView sponsoredLabel = (TextView) adView.findViewById(R.id.native_ad_sponsored_label);

        nativeAdMedia.setListener(new MediaViewListener() {
            @Override
            public void onVolumeChange(MediaView mediaView, float volume) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: Volume " + volume);
            }

            @Override
            public void onPause(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: Paused");
            }

            @Override
            public void onPlay(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: Play");
            }

            @Override
            public void onFullscreenBackground(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: FullscreenBackground");
            }

            @Override
            public void onFullscreenForeground(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: FullscreenForeground");
            }

            @Override
            public void onExitFullscreen(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: ExitFullscreen");
            }

            @Override
            public void onEnterFullscreen(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: EnterFullscreen");
            }

            @Override
            public void onComplete(MediaView mediaView) {
                Log.e(martinodeveloper_Get_start_Activity.class.toString(), "MediaViewEvent: Completed");
            }
        });

        TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdCallToAction = (TextView) adView.findViewById(R.id.native_ad_call_to_action);
        LinearLayout L1 = (LinearLayout) adView.findViewById(R.id.L1);
        L1.setVisibility(View.VISIBLE);

        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        List< View > clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdMedia);
        clickableViews.add(nativeAdCallToAction);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);

        NativeAdBase.NativeComponentTag.tagView(nativeAdIcon, NativeAdBase.NativeComponentTag.AD_ICON);
        NativeAdBase.NativeComponentTag.tagView(nativeAdTitle, NativeAdBase.NativeComponentTag.AD_TITLE);
        NativeAdBase.NativeComponentTag.tagView(nativeAdBody, NativeAdBase.NativeComponentTag.AD_BODY);
        NativeAdBase.NativeComponentTag.tagView(nativeAdSocialContext, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT);
        NativeAdBase.NativeComponentTag.tagView(nativeAdCallToAction, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION);
    }

    public void loadfbNativeAd() {


        Log.e(TAG, "fbnative18 " + uploadClass.getFb_Native18());
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.martinodeveloper_native_ad_layout, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), uploadClass.getFb_Native18());
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative18==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative18==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative18==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }

                inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative18==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative18==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }

    private void showfbbanner() {
        Log.e(TAG, "fbban18 " + uploadClass.getFb_banner18());
        FrameLayout adViewContainer = findViewById(R.id.fl_b);
        bannerAdContainer = new com.facebook.ads.AdView(this, uploadClass.getFb_banner18(), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban18==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban18==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban18==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban18==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void ShowFullAds() {
        Log.e(TAG, "fbfull18 " + uploadClass.getFb_Ful18());
        try {
            if (martinodeveloper_SplashActivity.interstitialAd3 != null && martinodeveloper_SplashActivity.interstitialAd3.isAdLoaded())
                martinodeveloper_SplashActivity.interstitialAd3.show();
            else {
                if (!martinodeveloper_SplashActivity.interstitialAd3.isAdLoaded())
                    martinodeveloper_SplashActivity.interstitialAd3.loadAd();

                interstitialAd = new InterstitialAd(this, uploadClass.getFb_Ful18());
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull18 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull18" + adError.getErrorMessage());

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull18 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull16 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull16 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadgNativeAd() {
        Log.e(TAG, "gnative33 " + uploadClass.getFb_Native33());
        AdLoader adLoader = new AdLoader.Builder(martinodeveloper_Get_start_Activity.this, uploadClass.getFb_Native33())
                .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
                    @Override
                    public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                        if (gnativeAd != null) {
                            gnativeAd.destroy();
                        }
                        gnativeAd = unifiedNativeAd;
                        UnifiedNativeAdView adView = (UnifiedNativeAdView) getLayoutInflater()
                                .inflate(R.layout.martinodeveloper_video_ad_unifiedd, null);
                        populateUnifiedNativeAdView(unifiedNativeAd, adView);
                        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
                        nativeAdContainer.removeAllViews();
                        nativeAdContainer.addView(adView);
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder()
                        .build())
                .build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void loadgFull() {
        Log.e(TAG, "gful33 " + uploadClass.getFb_Ful33());
        gInterstitialAd = new com.google.android.gms.ads.InterstitialAd(this);
        gInterstitialAd.setAdUnitId(uploadClass.getFb_Ful33());

        gInterstitialAd.loadAd(new AdRequest.Builder().build());
        gInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Log.e("gfulladload==>", "onAdLoaded: ");
                if (progressDialog != null && progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                gInterstitialAd.show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.e("gflonAdFailedToLoad==>", "onAdFailedToLoad: " + errorCode);
            }

            @Override
            public void onAdOpened() {
                Log.e("gflonAdOpened==>", "onAdOpened: ");
            }

            @Override
            public void onAdClicked() {
                Log.e("gflonAdClicked==>", "onAdClicked: ");
            }

            @Override
            public void onAdLeftApplication() {
                Log.e("gflonAdLeftApp==>", "onAdLeftApplication: ");
                if (progressDialog != null && progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
            }

            @Override
            public void onAdClosed() {
                Log.e("gflonAdClosed==>", "onAdClosed: ");
            }
        });
    }

    private void showgbanner() {
        Log.e(TAG, "gban33 " + uploadClass.getFb_banner33());
        View adContainer = findViewById(R.id.fl_b);
        mAdView = new com.google.android.gms.ads.AdView(this);
        mAdView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
        mAdView.setAdUnitId(uploadClass.getFb_banner33());
        ((FrameLayout) adContainer).addView(mAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void populateUnifiedNativeAdView(UnifiedNativeAd nativeAd, UnifiedNativeAdView adView) {
        adView.setMediaView((com.google.android.gms.ads.formats.MediaView) adView.findViewById(R.id.ad_media));


        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            adView.getPriceView().setVisibility(View.INVISIBLE);
        } else {
            adView.getPriceView().setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }

        if (nativeAd.getStore() == null) {
            adView.getStoreView().setVisibility(View.INVISIBLE);
        } else {
            adView.getStoreView().setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView())
                    .setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }
}