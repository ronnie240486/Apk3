package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class NoAsyncCache extends com.android.volley.AsyncCache {
    public NoAsyncCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.volley.AsyncCache
    public void clear(com.android.volley.AsyncCache.OnWriteCompleteCallback r1) {
            r0 = this;
            r1.onWriteComplete()
            return
    }

    @Override // com.android.volley.AsyncCache
    public void get(java.lang.String r1, com.android.volley.AsyncCache.OnGetCompleteCallback r2) {
            r0 = this;
            r1 = 0
            r2.onGetComplete(r1)
            return
    }

    @Override // com.android.volley.AsyncCache
    public void initialize(com.android.volley.AsyncCache.OnWriteCompleteCallback r1) {
            r0 = this;
            r1.onWriteComplete()
            return
    }

    @Override // com.android.volley.AsyncCache
    public void invalidate(java.lang.String r1, boolean r2, com.android.volley.AsyncCache.OnWriteCompleteCallback r3) {
            r0 = this;
            r3.onWriteComplete()
            return
    }

    @Override // com.android.volley.AsyncCache
    public void put(java.lang.String r1, com.android.volley.Cache.Entry r2, com.android.volley.AsyncCache.OnWriteCompleteCallback r3) {
            r0 = this;
            r3.onWriteComplete()
            return
    }

    @Override // com.android.volley.AsyncCache
    public void remove(java.lang.String r1, com.android.volley.AsyncCache.OnWriteCompleteCallback r2) {
            r0 = this;
            r2.onWriteComplete()
            return
    }
}
