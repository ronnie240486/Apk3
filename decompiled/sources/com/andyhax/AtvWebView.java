package com.andyhax;

/* JADX INFO: compiled from: RTXWebView.java */
/* JADX INFO: loaded from: classes3.dex */
public class AtvWebView extends android.webkit.WebView {
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
            java.lang.String r1 = "2e6cbc35805d92ce8e1c560d57f30150"
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.andyhax.AtvWebView.DEFAULT_URL = r0
            return
    }

    public AtvWebView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    public AtvWebView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    public AtvWebView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.isScrolling = r0
            r1.init()
            return
    }

    static /* synthetic */ android.os.Handler access$000(com.andyhax.AtvWebView r1) {
            android.os.Handler r0 = r1.handler
            return r0
    }

    static /* synthetic */ boolean access$102(com.andyhax.AtvWebView r0, boolean r1) {
            r0.isScrolling = r1
            return r1
    }

    private void init() {
            r2 = this;
            com.andyhax.AtvWebView$1 r0 = new com.andyhax.AtvWebView$1
            r0.<init>(r2)
            r2.setWebViewClient(r0)
            r0 = 0
            r2.setBackgroundColor(r0)
            r0 = 2
            r1 = 0
            r2.setLayerType(r0, r1)
            android.webkit.WebSettings r0 = r2.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            java.lang.String r0 = com.andyhax.AtvWebView.DEFAULT_URL
            r2.loadUrl(r0)
            return
    }

    public void scrollToBottom() {
            r3 = this;
            boolean r0 = r3.isScrolling
            if (r0 != 0) goto L18
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.handler = r0
            r0 = 1
            r3.isScrolling = r0
            com.andyhax.AtvWebView$2 r0 = new com.andyhax.AtvWebView$2
            r0.<init>(r3)
            r1 = 100
            r3.postDelayed(r0, r1)
        L18:
            return
    }

    public void stopScrolling() {
            r2 = this;
            boolean r0 = r2.isScrolling
            if (r0 == 0) goto Lf
            android.os.Handler r0 = r2.handler
            if (r0 == 0) goto Lc
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Lc:
            r0 = 0
            r2.isScrolling = r0
        Lf:
            return
    }
}
