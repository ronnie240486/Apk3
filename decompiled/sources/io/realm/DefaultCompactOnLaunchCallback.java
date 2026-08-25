package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class DefaultCompactOnLaunchCallback implements io.realm.CompactOnLaunchCallback {
    public DefaultCompactOnLaunchCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.realm.CompactOnLaunchCallback
    public boolean shouldCompact(long r4, long r6) {
            r3 = this;
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L12
            double r6 = (double) r6
            double r4 = (double) r4
            double r6 = r6 / r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }
}
