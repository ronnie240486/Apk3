package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a(\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\bø\u0001\u0000\u001a\"\u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0007\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a:\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\bø\u0001\u0000¢\u0006\u0002\b=\u001a)\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\bø\u0001\u0000\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewKt {





    public static /* synthetic */ void $r8$lambda$Y6wGMU_rQCvb5uOg5WbipwD8gCc(kotlin.jvm.functions.Function0 r0) {
            m37postOnAnimationDelayed$lambda1(r0)
            return
    }

    public static final void doOnAttach(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r0 == 0) goto L14
            r2.invoke(r1)
            goto L1c
        L14:
            androidx.core.view.ViewKt$doOnAttach$1 r0 = new androidx.core.view.ViewKt$doOnAttach$1
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
        L1c:
            return
    }

    public static final void doOnDetach(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r0 != 0) goto L14
            r2.invoke(r1)
            goto L1c
        L14:
            androidx.core.view.ViewKt$doOnDetach$1 r0 = new androidx.core.view.ViewKt$doOnDetach$1
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
        L1c:
            return
    }

    public static final void doOnLayout(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 == 0) goto L1a
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L1a
            r2.invoke(r1)
            goto L22
        L1a:
            androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
        L22:
            return
    }

    public static final void doOnNextLayout(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.ViewKt$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnNextLayout$1
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.ViewKt$doOnPreDraw$1 r0 = new androidx.core.view.ViewKt$doOnPreDraw$1
            r0.<init>(r2, r1)
            androidx.core.view.OneShotPreDrawListener r1 = androidx.core.view.OneShotPreDrawListener.add(r1, r0)
            java.lang.String r2 = "View.doOnPreDraw(\n    cr…dd(this) { action(this) }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap drawToBitmap(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r0 == 0) goto L39
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r1, r4)
            java.lang.String r0 = "createBitmap(width, height, config)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            int r1 = r3.getScrollX()
            float r1 = (float) r1
            float r1 = -r1
            int r2 = r3.getScrollY()
            float r2 = (float) r2
            float r2 = -r2
            r0.translate(r1, r2)
            r3.draw(r0)
            return r4
        L39:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "View needs to be laid out before calling drawToBitmap()"
            r3.<init>(r4)
            throw r3
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View r0, android.graphics.Bitmap.Config r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = drawToBitmap(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<android.view.View> getAllViews(@org.jetbrains.annotations.NotNull android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sequence(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<android.view.ViewParent> getAncestors(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewParent r1 = r1.getParent()
            androidx.core.view.ViewKt$ancestors$1 r0 = androidx.core.view.ViewKt$ancestors$1.INSTANCE
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.generateSequence(r1, r0)
            return r1
    }

    public static final int getMarginBottom(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L10
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L16
            int r1 = r1.bottomMargin
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static final int getMarginEnd(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L14
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r1)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public static final int getMarginLeft(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L10
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L16
            int r1 = r1.leftMargin
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static final int getMarginRight(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L10
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L16
            int r1 = r1.rightMargin
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static final int getMarginStart(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L14
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r1)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public static final int getMarginTop(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L10
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L16
            int r1 = r1.topMargin
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static final boolean isGone(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getVisibility()
            r0 = 8
            if (r1 != r0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public static final boolean isInvisible(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getVisibility()
            r0 = 4
            if (r1 != r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final boolean isVisible(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postDelayed(@org.jetbrains.annotations.NotNull android.view.View r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.core.view.ViewKt$postDelayed$runnable$1 r0 = new androidx.core.view.ViewKt$postDelayed$runnable$1
            r0.<init>(r4)
            r1.postDelayed(r0, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(16)
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postOnAnimationDelayed(@org.jetbrains.annotations.NotNull android.view.View r2, long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.core.view.ViewKt$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r5, r1)
            androidx.core.view.Api16Impl.postOnAnimationDelayed(r2, r0, r3)
            return r0
    }

    /* JADX INFO: renamed from: postOnAnimationDelayed$lambda-1, reason: not valid java name */
    private static final void m37postOnAnimationDelayed$lambda1(kotlin.jvm.functions.Function0 r1) {
            java.lang.String r0 = "$action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.invoke()
            return
    }

    public static final void setGone(@org.jetbrains.annotations.NotNull android.view.View r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto La
            r2 = 8
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.setVisibility(r2)
            return
    }

    public static final void setInvisible(@org.jetbrains.annotations.NotNull android.view.View r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L9
            r2 = 4
            goto La
        L9:
            r2 = 0
        La:
            r1.setVisibility(r2)
            return
    }

    public static final void setPadding(@org.jetbrains.annotations.NotNull android.view.View r1, @androidx.annotation.Px int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setPadding(r2, r2, r2, r2)
            return
    }

    public static final void setVisible(@org.jetbrains.annotations.NotNull android.view.View r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L9
            r2 = 0
            goto Lb
        L9:
            r2 = 8
        Lb:
            r1.setVisibility(r2)
            return
    }

    public static final void updateLayoutParams(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            java.util.Objects.requireNonNull(r0, r1)
            r3.invoke(r0)
            r2.setLayoutParams(r0)
            return
    }

    @kotlin.jvm.JvmName(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View r3, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = 1
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            r4.invoke(r0)
            r3.setLayoutParams(r0)
            return
    }

    public static final void updatePadding(@org.jetbrains.annotations.NotNull android.view.View r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Px int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setPadding(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updatePadding$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingLeft()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingRight()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(17)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final void updatePaddingRelative(@org.jetbrains.annotations.NotNull android.view.View r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Px int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setPaddingRelative(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingEnd()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
