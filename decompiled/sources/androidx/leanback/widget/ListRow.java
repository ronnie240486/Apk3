package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ListRow extends androidx.leanback.widget.Row {
    private final androidx.leanback.widget.ObjectAdapter mAdapter;
    private java.lang.CharSequence mContentDescription;

    public ListRow(long r1, androidx.leanback.widget.HeaderItem r3, androidx.leanback.widget.ObjectAdapter r4) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.mAdapter = r4
            r0.verify()
            return
    }

    public ListRow(androidx.leanback.widget.HeaderItem r1, androidx.leanback.widget.ObjectAdapter r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mAdapter = r2
            r0.verify()
            return
    }

    public ListRow(androidx.leanback.widget.ObjectAdapter r1) {
            r0 = this;
            r0.<init>()
            r0.mAdapter = r1
            r0.verify()
            return
    }

    private void verify() {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ObjectAdapter cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public final androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r2 = this;
            java.lang.CharSequence r0 = r2.mContentDescription
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.leanback.widget.HeaderItem r0 = r2.getHeaderItem()
            if (r0 == 0) goto L17
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == 0) goto L12
            return r1
        L12:
            java.lang.String r0 = r0.getName()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public void setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mContentDescription = r1
            return
    }
}
