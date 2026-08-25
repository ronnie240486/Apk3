package com.andyhax.Task;

/* JADX INFO: compiled from: RTXQrView.java */
/* JADX INFO: loaded from: classes2.dex */
public class AtvQrView extends android.webkit.WebView {
    private static final java.lang.String DEFAULT_URL = null;
    private static final int SCROLL_DELAY = 100;
    private android.os.Handler handler;
    private boolean isScrolling;


    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.android.volley.Async2Cache.a
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            r0.append(r1)
            java.lang.String r1 = "66acf41979295a68326f62539c21101d"
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.andyhax.Task.AtvQrView.DEFAULT_URL = r0
            return
    }

    public AtvQrView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    public AtvQrView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    public AtvQrView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    private void init() {
            r3 = this;
            r0 = 0
            r3.setBackgroundColor(r0)
            r0 = 2
            r1 = 0
            r3.setLayerType(r0, r1)
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2)
            r1 = 0
            r0.setDuration(r1)
            com.andyhax.Task.AtvQrView$1 r1 = new com.andyhax.Task.AtvQrView$1
            r1.<init>(r3, r0)
            r3.setWebViewClient(r1)
            java.lang.String r1 = com.andyhax.Task.AtvQrView.DEFAULT_URL
            r3.loadUrl(r1)
            return
    }
}
