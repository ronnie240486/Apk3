package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRetryPolicy implements com.android.volley.RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private final float mBackoffMultiplier;
    private int mCurrentRetryCount;
    private int mCurrentTimeoutMs;
    private final int mMaxNumRetries;

    public DefaultRetryPolicy() {
            r3 = this;
            r0 = 2500(0x9c4, float:3.503E-42)
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r0, r1, r2)
            return
    }

    public DefaultRetryPolicy(int r1, int r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.mCurrentTimeoutMs = r1
            r0.mMaxNumRetries = r2
            r0.mBackoffMultiplier = r3
            return
    }

    public float getBackoffMultiplier() {
            r1 = this;
            float r0 = r1.mBackoffMultiplier
            return r0
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentRetryCount() {
            r1 = this;
            int r0 = r1.mCurrentRetryCount
            return r0
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentTimeout() {
            r1 = this;
            int r0 = r1.mCurrentTimeoutMs
            return r0
    }

    @Override // com.android.volley.RetryPolicy
    public void retry(com.android.volley.VolleyError r6) throws com.android.volley.VolleyError {
            r5 = this;
            int r0 = r5.mCurrentRetryCount
            r1 = 1
            int r0 = r0 + r1
            r5.mCurrentRetryCount = r0
            int r2 = r5.mCurrentTimeoutMs
            float r3 = (float) r2
            float r4 = r5.mBackoffMultiplier
            float r3 = r3 * r4
            int r3 = (int) r3
            int r2 = r2 + r3
            r5.mCurrentTimeoutMs = r2
            int r2 = r5.mMaxNumRetries
            if (r0 > r2) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1a
            return
        L1a:
            throw r6
    }
}
