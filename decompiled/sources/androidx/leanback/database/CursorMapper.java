package androidx.leanback.database;

/* JADX INFO: loaded from: classes.dex */
public abstract class CursorMapper {
    private android.database.Cursor mCursor;

    public CursorMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object bind();

    public abstract void bindColumns();

    public java.lang.Object convert(android.database.Cursor r2) {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r2 == r0) goto L9
            r1.mCursor = r2
            r1.bindColumns()
        L9:
            java.lang.Object r2 = r1.bind()
            return r2
    }
}
