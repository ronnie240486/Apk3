package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class Row {
    private static final int FLAG_ID_USE_HEADER = 1;
    private static final int FLAG_ID_USE_ID = 0;
    private static final int FLAG_ID_USE_MASK = 1;
    private int mFlags;
    private androidx.leanback.widget.HeaderItem mHeaderItem;
    private long mId;

    public Row() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mFlags = r0
            r0 = -1
            r2.mId = r0
            return
    }

    public Row(long r3, androidx.leanback.widget.HeaderItem r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mFlags = r0
            r0 = -1
            r2.mId = r0
            r2.setId(r3)
            r2.setHeaderItem(r5)
            return
    }

    public Row(androidx.leanback.widget.HeaderItem r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mFlags = r0
            r0 = -1
            r2.mId = r0
            r2.setHeaderItem(r3)
            return
    }

    public final androidx.leanback.widget.HeaderItem getHeaderItem() {
            r1 = this;
            androidx.leanback.widget.HeaderItem r0 = r1.mHeaderItem
            return r0
    }

    public final long getId() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L14
            androidx.leanback.widget.HeaderItem r0 = r2.getHeaderItem()
            if (r0 == 0) goto L11
            long r0 = r0.getId()
            return r0
        L11:
            r0 = -1
            return r0
        L14:
            long r0 = r2.mId
            return r0
    }

    public boolean isRenderedAsRowView() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setHeaderItem(androidx.leanback.widget.HeaderItem r1) {
            r0 = this;
            r0.mHeaderItem = r1
            return
    }

    public final void setId(long r1) {
            r0 = this;
            r0.mId = r1
            int r1 = r0.mFlags
            r1 = r1 & (-2)
            r2 = 0
            r1 = r1 | r2
            r0.mFlags = r1
            return
    }
}
