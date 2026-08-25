package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class CursorObjectAdapter extends androidx.leanback.widget.ObjectAdapter {
    private static final int CACHE_SIZE = 100;
    private android.database.Cursor mCursor;
    private final android.util.LruCache<java.lang.Integer, java.lang.Object> mItemCache;
    private androidx.leanback.database.CursorMapper mMapper;

    public CursorObjectAdapter() {
            r2 = this;
            r2.<init>()
            android.util.LruCache r0 = new android.util.LruCache
            r1 = 100
            r0.<init>(r1)
            r2.mItemCache = r0
            return
    }

    public CursorObjectAdapter(androidx.leanback.widget.Presenter r2) {
            r1 = this;
            r1.<init>(r2)
            android.util.LruCache r2 = new android.util.LruCache
            r0 = 100
            r2.<init>(r0)
            r1.mItemCache = r2
            return
    }

    public CursorObjectAdapter(androidx.leanback.widget.PresenterSelector r2) {
            r1 = this;
            r1.<init>(r2)
            android.util.LruCache r2 = new android.util.LruCache
            r0 = 100
            r2.<init>(r0)
            r1.mItemCache = r2
            return
    }

    public void changeCursor(android.database.Cursor r2) {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r2 != r0) goto L5
            return
        L5:
            if (r0 == 0) goto La
            r0.close()
        La:
            r1.mCursor = r2
            android.util.LruCache<java.lang.Integer, java.lang.Object> r2 = r1.mItemCache
            r0 = 0
            r2.trimToSize(r0)
            r1.notifyChanged()
            return
    }

    public void close() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto La
            r0.close()
            r0 = 0
            r1.mCursor = r0
        La:
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public java.lang.Object get(int r3) {
            r2 = this;
            android.database.Cursor r0 = r2.mCursor
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            boolean r0 = r0.moveToPosition(r3)
            if (r0 == 0) goto L2b
            android.util.LruCache<java.lang.Integer, java.lang.Object> r0 = r2.mItemCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L19
            return r0
        L19:
            androidx.leanback.database.CursorMapper r0 = r2.mMapper
            android.database.Cursor r1 = r2.mCursor
            java.lang.Object r0 = r0.convert(r1)
            android.util.LruCache<java.lang.Integer, java.lang.Object> r1 = r2.mItemCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            return r0
        L2b:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public final android.database.Cursor getCursor() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            return r0
    }

    public final androidx.leanback.database.CursorMapper getMapper() {
            r1 = this;
            androidx.leanback.database.CursorMapper r0 = r1.mMapper
            return r0
    }

    public boolean isClosed() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto Ld
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setMapper(androidx.leanback.database.CursorMapper r1) {
            r0 = this;
            r0.mMapper = r1
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCount()
            return r0
    }

    public android.database.Cursor swapCursor(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.mCursor
            if (r3 != r0) goto L5
            return r0
        L5:
            r2.mCursor = r3
            android.util.LruCache<java.lang.Integer, java.lang.Object> r3 = r2.mItemCache
            r1 = 0
            r3.trimToSize(r1)
            r2.notifyChanged()
            return r0
    }
}
