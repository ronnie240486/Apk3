package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncCache {

    /* JADX INFO: loaded from: classes.dex */
    public interface OnGetCompleteCallback {
        void onGetComplete(@androidx.annotation.Nullable com.android.volley.Cache.Entry r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnWriteCompleteCallback {
        void onWriteComplete();
    }

    public AsyncCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void clear(com.android.volley.AsyncCache.OnWriteCompleteCallback r1);

    public abstract void get(java.lang.String r1, com.android.volley.AsyncCache.OnGetCompleteCallback r2);

    public abstract void initialize(com.android.volley.AsyncCache.OnWriteCompleteCallback r1);

    public abstract void invalidate(java.lang.String r1, boolean r2, com.android.volley.AsyncCache.OnWriteCompleteCallback r3);

    public abstract void put(java.lang.String r1, com.android.volley.Cache.Entry r2, com.android.volley.AsyncCache.OnWriteCompleteCallback r3);

    public abstract void remove(java.lang.String r1, com.android.volley.AsyncCache.OnWriteCompleteCallback r2);
}
