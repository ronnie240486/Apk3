package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class VectorEnabledTintResources extends androidx.appcompat.widget.ResourcesWrapper {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled;
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    public VectorEnabledTintResources(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.mContextRef = r2
            return
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.sCompatVectorFromResourcesEnabled
            return r0
    }

    public static void setCompatVectorFromResourcesEnabled(boolean r0) {
            androidx.appcompat.widget.VectorEnabledTintResources.sCompatVectorFromResourcesEnabled = r0
            return
    }

    public static boolean shouldBeUsed() {
            boolean r0 = isCompatVectorFromResourcesEnabled()
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getAnimation(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getAnimation(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            boolean r1 = super.getBoolean(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getColor(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getColorStateList(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.ColorStateList r1 = super.getColorStateList(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.Configuration getConfiguration() {
            r1 = this;
            android.content.res.Configuration r0 = super.getConfiguration()
            return r0
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            float r1 = super.getDimension(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getDimensionPixelOffset(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getDimensionPixelSize(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.util.DisplayMetrics getDisplayMetrics() {
            r1 = this;
            android.util.DisplayMetrics r0 = super.getDisplayMetrics()
            return r0
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) throws android.content.res.Resources.NotFoundException {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.mContextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L13
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r3 = r1.onDrawableLoadedFromResources(r0, r2, r3)
            return r3
        L13:
            android.graphics.drawable.Drawable r3 = r2.getDrawableCanonical(r3)
            return r3
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @androidx.annotation.RequiresApi(21)
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawable(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @androidx.annotation.RequiresApi(15)
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawableForDensity(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @androidx.annotation.RequiresApi(21)
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawableForDensity(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int r1, int r2, int r3) {
            r0 = this;
            float r1 = super.getFraction(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            int r1 = super.getIdentifier(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int[] r1 = super.getIntArray(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getInteger(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getLayout(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getLayout(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.Movie getMovie(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.Movie r1 = super.getMovie(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getQuantityString(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int r1, int r2, java.lang.Object[] r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getQuantityString(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getQuantityText(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence r1 = super.getQuantityText(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceEntryName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceEntryName(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceName(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourcePackageName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourcePackageName(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceTypeName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceTypeName(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getString(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int r1, java.lang.Object[] r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getString(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String[] getStringArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String[] r1 = super.getStringArray(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence r1 = super.getText(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = super.getText(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence[] getTextArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence[] r1 = super.getTextArray(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int r1, android.util.TypedValue r2, boolean r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.getValue(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(java.lang.String r1, android.util.TypedValue r2, boolean r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.getValue(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @androidx.annotation.RequiresApi(15)
    public /* bridge */ /* synthetic */ void getValueForDensity(int r1, int r2, android.util.TypedValue r3, boolean r4) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.getValueForDensity(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getXml(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getXml(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainAttributes(android.util.AttributeSet r1, int[] r2) {
            r0 = this;
            android.content.res.TypedArray r1 = super.obtainAttributes(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainTypedArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.TypedArray r1 = super.obtainTypedArray(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.io.InputStream r1 = super.openRawResource(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int r1, android.util.TypedValue r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.io.InputStream r1 = super.openRawResource(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor openRawResourceFd(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = super.openRawResourceFd(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(java.lang.String r1, android.util.AttributeSet r2, android.os.Bundle r3) throws org.xmlpull.v1.XmlPullParserException {
            r0 = this;
            super.parseBundleExtra(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(android.content.res.XmlResourceParser r1, android.os.Bundle r2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = this;
            super.parseBundleExtras(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(android.content.res.Configuration r1, android.util.DisplayMetrics r2) {
            r0 = this;
            super.updateConfiguration(r1, r2)
            return
    }
}
