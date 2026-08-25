package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public interface Cache {

    /* JADX INFO: loaded from: classes.dex */
    public static class Entry {
        public java.util.List<com.android.volley.Header> allResponseHeaders;
        public byte[] data;
        public java.lang.String etag;
        public long lastModified;
        public java.util.Map<java.lang.String, java.lang.String> responseHeaders;
        public long serverDate;
        public long softTtl;
        public long ttl;

        public Entry() {
                r1 = this;
                r1.<init>()
                java.util.Map r0 = java.util.Collections.emptyMap()
                r1.responseHeaders = r0
                return
        }

        public boolean isExpired() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                boolean r0 = r2.isExpired(r0)
                return r0
        }

        public final boolean isExpired(long r4) {
                r3 = this;
                long r0 = r3.ttl
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 >= 0) goto L8
                r4 = 1
                goto L9
            L8:
                r4 = 0
            L9:
                return r4
        }

        public boolean refreshNeeded() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                boolean r0 = r2.refreshNeeded(r0)
                return r0
        }

        public final boolean refreshNeeded(long r4) {
                r3 = this;
                long r0 = r3.softTtl
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 >= 0) goto L8
                r4 = 1
                goto L9
            L8:
                r4 = 0
            L9:
                return r4
        }
    }

    void clear();

    @androidx.annotation.Nullable
    com.android.volley.Cache.Entry get(java.lang.String r1);

    void initialize();

    void invalidate(java.lang.String r1, boolean r2);

    void put(java.lang.String r1, com.android.volley.Cache.Entry r2);

    void remove(java.lang.String r1);
}
