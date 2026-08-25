package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public Rectangle() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean contains(int r3, int r4) {
            r2 = this;
            int r0 = r2.x
            if (r3 < r0) goto L14
            int r1 = r2.width
            int r0 = r0 + r1
            if (r3 >= r0) goto L14
            int r3 = r2.y
            if (r4 < r3) goto L14
            int r0 = r2.height
            int r3 = r3 + r0
            if (r4 >= r3) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }

    public int getCenterX() {
            r2 = this;
            int r0 = r2.x
            int r1 = r2.width
            int r0 = r0 + r1
            int r0 = r0 / 2
            return r0
    }

    public int getCenterY() {
            r2 = this;
            int r0 = r2.y
            int r1 = r2.height
            int r0 = r0 + r1
            int r0 = r0 / 2
            return r0
    }

    public void setBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }
}
