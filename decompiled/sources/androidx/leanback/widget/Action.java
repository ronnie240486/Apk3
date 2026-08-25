package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class Action {
    public static final long NO_ID = -1;
    private android.graphics.drawable.Drawable mIcon;
    private long mId;
    private java.util.ArrayList<java.lang.Integer> mKeyCodes;
    private java.lang.CharSequence mLabel1;
    private java.lang.CharSequence mLabel2;

    public Action(long r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r0)
            return
    }

    public Action(long r2, java.lang.CharSequence r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r4, r0)
            return
    }

    public Action(long r7, java.lang.CharSequence r9, java.lang.CharSequence r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r3, r4, r5)
            return
    }

    public Action(long r3, java.lang.CharSequence r5, java.lang.CharSequence r6, android.graphics.drawable.Drawable r7) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mId = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mKeyCodes = r0
            r2.setId(r3)
            r2.setLabel1(r5)
            r2.setLabel2(r6)
            r2.setIcon(r7)
            return
    }

    public final void addKeyCode(int r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mKeyCodes
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            return
    }

    public final android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIcon
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.mId
            return r0
    }

    public final java.lang.CharSequence getLabel1() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel1
            return r0
    }

    public final java.lang.CharSequence getLabel2() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel2
            return r0
    }

    public final void removeKeyCode(int r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mKeyCodes
            r0.remove(r2)
            return
    }

    public final boolean respondsToKeyCode(int r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mKeyCodes
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    public final void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mIcon = r1
            return
    }

    public final void setId(long r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    public final void setLabel1(java.lang.CharSequence r1) {
            r0 = this;
            r0.mLabel1 = r1
            return
    }

    public final void setLabel2(java.lang.CharSequence r1) {
            r0 = this;
            r0.mLabel2 = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r2.mLabel1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L12
            java.lang.CharSequence r1 = r2.mLabel1
            r0.append(r1)
        L12:
            java.lang.CharSequence r1 = r2.mLabel2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2c
            java.lang.CharSequence r1 = r2.mLabel1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = " "
            r0.append(r1)
        L27:
            java.lang.CharSequence r1 = r2.mLabel2
            r0.append(r1)
        L2c:
            android.graphics.drawable.Drawable r1 = r2.mIcon
            if (r1 == 0) goto L3b
            int r1 = r0.length()
            if (r1 != 0) goto L3b
            java.lang.String r1 = "(action icon)"
            r0.append(r1)
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
