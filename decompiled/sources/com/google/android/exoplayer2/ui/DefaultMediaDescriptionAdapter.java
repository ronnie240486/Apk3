package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaDescriptionAdapter implements com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter {

    @androidx.annotation.Nullable
    private final android.app.PendingIntent pendingIntent;

    public DefaultMediaDescriptionAdapter(@androidx.annotation.Nullable android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.pendingIntent = r1
            return
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    @androidx.annotation.Nullable
    public android.app.PendingIntent createCurrentContentIntent(com.google.android.exoplayer2.Player r1) {
            r0 = this;
            android.app.PendingIntent r1 = r0.pendingIntent
            return r1
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    @androidx.annotation.Nullable
    public java.lang.CharSequence getCurrentContentText(com.google.android.exoplayer2.Player r3) {
            r2 = this;
            r0 = 18
            boolean r0 = r3.isCommandAvailable(r0)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.android.exoplayer2.MediaMetadata r0 = r3.getMediaMetadata()
            java.lang.CharSequence r0 = r0.artist
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L17
            return r0
        L17:
            com.google.android.exoplayer2.MediaMetadata r3 = r3.getMediaMetadata()
            java.lang.CharSequence r3 = r3.albumArtist
            return r3
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public java.lang.CharSequence getCurrentContentTitle(com.google.android.exoplayer2.Player r4) {
            r3 = this;
            r0 = 18
            boolean r0 = r4.isCommandAvailable(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            return r1
        Lb:
            com.google.android.exoplayer2.MediaMetadata r0 = r4.getMediaMetadata()
            java.lang.CharSequence r0 = r0.displayTitle
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L18
            return r0
        L18:
            com.google.android.exoplayer2.MediaMetadata r4 = r4.getMediaMetadata()
            java.lang.CharSequence r4 = r4.title
            if (r4 == 0) goto L21
            r1 = r4
        L21:
            return r1
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    @androidx.annotation.Nullable
    public android.graphics.Bitmap getCurrentLargeIcon(com.google.android.exoplayer2.Player r2, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback r3) {
            r1 = this;
            r3 = 18
            boolean r3 = r2.isCommandAvailable(r3)
            r0 = 0
            if (r3 != 0) goto La
            return r0
        La:
            com.google.android.exoplayer2.MediaMetadata r2 = r2.getMediaMetadata()
            byte[] r2 = r2.artworkData
            if (r2 != 0) goto L13
            return r0
        L13:
            r3 = 0
            int r0 = r2.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public final /* synthetic */ java.lang.CharSequence getCurrentSubText(com.google.android.exoplayer2.Player r1) {
            r0 = this;
            java.lang.CharSequence r1 = com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter.CC.$default$getCurrentSubText(r0, r1)
            return r1
    }
}
