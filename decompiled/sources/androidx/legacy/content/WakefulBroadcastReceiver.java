package androidx.legacy.content;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks = r0
            r0 = 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r0
            return
    }

    public WakefulBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean completeWakefulIntent(android.content.Intent r5) {
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1 = 0
            int r5 = r5.getIntExtra(r0, r1)
            if (r5 != 0) goto La
            return r1
        La:
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L36
            android.os.PowerManager$WakeLock r1 = (android.os.PowerManager.WakeLock) r1     // Catch: java.lang.Throwable -> L36
            r2 = 1
            if (r1 == 0) goto L1e
            r1.release()     // Catch: java.lang.Throwable -> L36
            r0.remove(r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r2
        L1e:
            java.lang.String r1 = "WakefulBroadcastReceiv."
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "No active wake lock id #"
            r3.append(r4)     // Catch: java.lang.Throwable -> L36
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r2
        L36:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    public static android.content.ComponentName startWakefulService(android.content.Context r5, android.content.Intent r6) {
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r0)
            int r1 = androidx.legacy.content.WakefulBroadcastReceiver.mNextId     // Catch: java.lang.Throwable -> L4d
            int r2 = r1 + 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r2     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            if (r2 > 0) goto Le
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r3     // Catch: java.lang.Throwable -> L4d
        Le:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r6.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L4d
            android.content.ComponentName r6 = r5.startService(r6)     // Catch: java.lang.Throwable -> L4d
            if (r6 != 0) goto L1c
            r5 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r5
        L1c:
            java.lang.String r2 = "power"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> L4d
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r2.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "androidx.core:wake:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.flattenToShortString()     // Catch: java.lang.Throwable -> L4d
            r2.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4d
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r3, r2)     // Catch: java.lang.Throwable -> L4d
            r2 = 0
            r5.setReferenceCounted(r2)     // Catch: java.lang.Throwable -> L4d
            r2 = 60000(0xea60, double:2.9644E-319)
            r5.acquire(r2)     // Catch: java.lang.Throwable -> L4d
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r6
        L4d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r5
    }
}
