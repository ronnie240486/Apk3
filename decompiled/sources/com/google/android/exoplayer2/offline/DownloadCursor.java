package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public interface DownloadCursor extends java.io.Closeable {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadCursor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isAfterLast(com.google.android.exoplayer2.offline.DownloadCursor r2) {
                int r0 = r2.getCount()
                r1 = 1
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r2.getPosition()
                int r2 = r2.getCount()
                if (r0 != r2) goto L13
                goto L14
            L13:
                r1 = 0
            L14:
                return r1
        }

        public static boolean $default$isBeforeFirst(com.google.android.exoplayer2.offline.DownloadCursor r2) {
                int r0 = r2.getCount()
                r1 = 1
                if (r0 != 0) goto L8
                return r1
            L8:
                int r2 = r2.getPosition()
                r0 = -1
                if (r2 != r0) goto L10
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }

        public static boolean $default$isFirst(com.google.android.exoplayer2.offline.DownloadCursor r1) {
                int r0 = r1.getPosition()
                if (r0 != 0) goto Le
                int r1 = r1.getCount()
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        public static boolean $default$isLast(com.google.android.exoplayer2.offline.DownloadCursor r2) {
                int r0 = r2.getCount()
                int r2 = r2.getPosition()
                int r1 = r0 + (-1)
                if (r2 != r1) goto L10
                if (r0 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        public static boolean $default$moveToFirst(com.google.android.exoplayer2.offline.DownloadCursor r1) {
                r0 = 0
                boolean r1 = r1.moveToPosition(r0)
                return r1
        }

        public static boolean $default$moveToLast(com.google.android.exoplayer2.offline.DownloadCursor r1) {
                int r0 = r1.getCount()
                int r0 = r0 + (-1)
                boolean r1 = r1.moveToPosition(r0)
                return r1
        }

        public static boolean $default$moveToNext(com.google.android.exoplayer2.offline.DownloadCursor r1) {
                int r0 = r1.getPosition()
                int r0 = r0 + 1
                boolean r1 = r1.moveToPosition(r0)
                return r1
        }

        public static boolean $default$moveToPrevious(com.google.android.exoplayer2.offline.DownloadCursor r1) {
                int r0 = r1.getPosition()
                int r0 = r0 + (-1)
                boolean r1 = r1.moveToPosition(r0)
                return r1
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    com.google.android.exoplayer2.offline.Download getDownload();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToLast();

    boolean moveToNext();

    boolean moveToPosition(int r1);

    boolean moveToPrevious();
}
