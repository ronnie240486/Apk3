package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public class AppWidgetTarget extends com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap> {
    private final android.content.ComponentName componentName;
    private final android.content.Context context;
    private final android.widget.RemoteViews remoteViews;
    private final int viewId;
    private final int[] widgetIds;

    public AppWidgetTarget(android.content.Context r1, int r2, int r3, int r4, android.widget.RemoteViews r5, android.content.ComponentName r6) {
            r0 = this;
            r0.<init>(r2, r3)
            java.lang.String r2 = "Context can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1, r2)
            android.content.Context r1 = (android.content.Context) r1
            r0.context = r1
            java.lang.String r1 = "RemoteViews object can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r5, r1)
            android.widget.RemoteViews r1 = (android.widget.RemoteViews) r1
            r0.remoteViews = r1
            java.lang.String r1 = "ComponentName can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r6, r1)
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            r0.componentName = r1
            r0.viewId = r4
            r1 = 0
            r0.widgetIds = r1
            return
    }

    public AppWidgetTarget(android.content.Context r1, int r2, int r3, int r4, android.widget.RemoteViews r5, int... r6) {
            r0 = this;
            r0.<init>(r2, r3)
            int r2 = r6.length
            if (r2 == 0) goto L2a
            java.lang.String r2 = "Context can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1, r2)
            android.content.Context r1 = (android.content.Context) r1
            r0.context = r1
            java.lang.String r1 = "RemoteViews object can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r5, r1)
            android.widget.RemoteViews r1 = (android.widget.RemoteViews) r1
            r0.remoteViews = r1
            java.lang.String r1 = "WidgetIds can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r6, r1)
            int[] r1 = (int[]) r1
            r0.widgetIds = r1
            r0.viewId = r4
            r1 = 0
            r0.componentName = r1
            return
        L2a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "WidgetIds must have length > 0"
            r1.<init>(r2)
            throw r1
    }

    public AppWidgetTarget(android.content.Context r8, int r9, android.widget.RemoteViews r10, android.content.ComponentName r11) {
            r7 = this;
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public AppWidgetTarget(android.content.Context r8, int r9, android.widget.RemoteViews r10, int... r11) {
            r7 = this;
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private void setBitmap(@androidx.annotation.Nullable android.graphics.Bitmap r3) {
            r2 = this;
            android.widget.RemoteViews r0 = r2.remoteViews
            int r1 = r2.viewId
            r0.setImageViewBitmap(r1, r3)
            r2.update()
            return
    }

    private void update() {
            r3 = this;
            android.content.Context r0 = r3.context
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r0)
            android.content.ComponentName r1 = r3.componentName
            if (r1 == 0) goto L10
            android.widget.RemoteViews r2 = r3.remoteViews
            r0.updateAppWidget(r1, r2)
            goto L17
        L10:
            int[] r1 = r3.widgetIds
            android.widget.RemoteViews r2 = r3.remoteViews
            r0.updateAppWidget(r1, r2)
        L17:
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = 0
            r0.setBitmap(r1)
            return
    }

    public void onResourceReady(@androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> r2) {
            r0 = this;
            r0.setBitmap(r1)
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition r2) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.onResourceReady(r1, r2)
            return
    }
}
