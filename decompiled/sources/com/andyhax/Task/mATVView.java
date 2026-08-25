package com.andyhax.Task;

/* JADX INFO: compiled from: mRTXView.java */
/* JADX INFO: loaded from: classes.dex */
public class mATVView extends android.widget.ImageView {
    public static android.content.Context mContext;
    private static android.widget.ImageView mImageView;

    public mATVView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            com.andyhax.Task.mATVView.mContext = r1
            com.andyhax.Task.mATVView.mImageView = r0
            r0.init(r1)
            return
    }

    public mATVView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.andyhax.Task.mATVView.mContext = r1
            com.andyhax.Task.mATVView.mImageView = r0
            r0.init(r1)
            return
    }

    public mATVView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.andyhax.Task.mATVView.mContext = r1
            com.andyhax.Task.mATVView.mImageView = r0
            r0.init(r1)
            return
    }

    private void init(android.content.Context r1) {
            r0 = this;
            r0.loadImage()
            return
    }

    public void loadImage() {
            r6 = this;
            r0 = 2131230987(0x7f08010b, float:1.8078042E38)
            android.content.Context r1 = com.andyhax.Task.mATVView.mContext     // Catch: java.lang.Exception -> L45
            java.io.File r1 = r1.getCacheDir()     // Catch: java.lang.Exception -> L45
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = "old_image0.jpg"
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L45
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L45
            java.lang.String r4 = "image0.jpg"
            r3.<init>(r1, r4)     // Catch: java.lang.Exception -> L45
            boolean r4 = r2.exists()     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L2b
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L45
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4)     // Catch: java.lang.Exception -> L45
            android.widget.ImageView r5 = com.andyhax.Task.mATVView.mImageView     // Catch: java.lang.Exception -> L45
            r5.setImageBitmap(r4)     // Catch: java.lang.Exception -> L45
            goto L44
        L2b:
            boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L3f
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L45
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4)     // Catch: java.lang.Exception -> L45
            android.widget.ImageView r5 = com.andyhax.Task.mATVView.mImageView     // Catch: java.lang.Exception -> L45
            r5.setImageBitmap(r4)     // Catch: java.lang.Exception -> L45
            goto L44
        L3f:
            android.widget.ImageView r4 = com.andyhax.Task.mATVView.mImageView     // Catch: java.lang.Exception -> L45
            r4.setImageResource(r0)     // Catch: java.lang.Exception -> L45
        L44:
            goto L4b
        L45:
            r1 = move-exception
            android.widget.ImageView r2 = com.andyhax.Task.mATVView.mImageView
            r2.setImageResource(r0)
        L4b:
            return
    }
}
