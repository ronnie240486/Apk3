package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class HeaderItem {
    private java.lang.CharSequence mContentDescription;
    private java.lang.CharSequence mDescription;
    private final long mId;
    private final java.lang.String mName;

    public HeaderItem(long r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mName = r3
            return
    }

    public HeaderItem(java.lang.String r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r0, r3)
            return
    }

    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mContentDescription
            return r0
    }

    public java.lang.CharSequence getDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDescription
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.mId
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public void setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mContentDescription = r1
            return
    }

    public void setDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mDescription = r1
            return
    }
}
