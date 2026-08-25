package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.CheckReturnValue
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
            r0 = this;
            r0.<init>()
            return
    }

    public Scheme(int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.primary = r1
            r1 = r4
            r0.onPrimary = r1
            r1 = r5
            r0.primaryContainer = r1
            r1 = r6
            r0.onPrimaryContainer = r1
            r1 = r7
            r0.secondary = r1
            r1 = r8
            r0.onSecondary = r1
            r1 = r9
            r0.secondaryContainer = r1
            r1 = r10
            r0.onSecondaryContainer = r1
            r1 = r11
            r0.tertiary = r1
            r1 = r12
            r0.onTertiary = r1
            r1 = r13
            r0.tertiaryContainer = r1
            r1 = r14
            r0.onTertiaryContainer = r1
            r1 = r15
            r0.error = r1
            r1 = r16
            r0.onError = r1
            r1 = r17
            r0.errorContainer = r1
            r1 = r18
            r0.onErrorContainer = r1
            r1 = r19
            r0.background = r1
            r1 = r20
            r0.onBackground = r1
            r1 = r21
            r0.surface = r1
            r1 = r22
            r0.onSurface = r1
            r1 = r23
            r0.surfaceVariant = r1
            r1 = r24
            r0.onSurfaceVariant = r1
            r1 = r25
            r0.outline = r1
            r1 = r26
            r0.outlineVariant = r1
            r1 = r27
            r0.shadow = r1
            r1 = r28
            r0.scrim = r1
            r1 = r29
            r0.inverseSurface = r1
            r1 = r30
            r0.inverseOnSurface = r1
            r1 = r31
            r0.inversePrimary = r1
            return
    }

    public static com.google.android.material.color.utilities.Scheme dark(int r0) {
            com.google.android.material.color.utilities.CorePalette r0 = com.google.android.material.color.utilities.CorePalette.of(r0)
            com.google.android.material.color.utilities.Scheme r0 = darkFromCorePalette(r0)
            return r0
    }

    public static com.google.android.material.color.utilities.Scheme darkContent(int r0) {
            com.google.android.material.color.utilities.CorePalette r0 = com.google.android.material.color.utilities.CorePalette.contentOf(r0)
            com.google.android.material.color.utilities.Scheme r0 = darkFromCorePalette(r0)
            return r0
    }

    private static com.google.android.material.color.utilities.Scheme darkFromCorePalette(com.google.android.material.color.utilities.CorePalette r7) {
            com.google.android.material.color.utilities.Scheme r0 = new com.google.android.material.color.utilities.Scheme
            r0.<init>()
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a1
            r2 = 80
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withPrimary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a1
            r3 = 20
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnPrimary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a1
            r4 = 30
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withPrimaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a1
            r5 = 90
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnPrimaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a2
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSecondary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a2
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSecondary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a2
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSecondaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a2
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSecondaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a3
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withTertiary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a3
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnTertiary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a3
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withTertiaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.a3
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnTertiaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.error
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withError(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.error
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnError(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.error
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withErrorContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.error
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnErrorContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            r6 = 10
            int r1 = r1.tone(r6)
            com.google.android.material.color.utilities.Scheme r0 = r0.withBackground(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnBackground(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r6)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n2
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSurfaceVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n2
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSurfaceVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n2
            r2 = 60
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOutline(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n2
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOutlineVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            r2 = 0
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withShadow(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withScrim(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withInverseSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r7.n1
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withInverseOnSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r7 = r7.a1
            r1 = 40
            int r7 = r7.tone(r1)
            com.google.android.material.color.utilities.Scheme r7 = r0.withInversePrimary(r7)
            return r7
    }

    public static com.google.android.material.color.utilities.Scheme light(int r0) {
            com.google.android.material.color.utilities.CorePalette r0 = com.google.android.material.color.utilities.CorePalette.of(r0)
            com.google.android.material.color.utilities.Scheme r0 = lightFromCorePalette(r0)
            return r0
    }

    public static com.google.android.material.color.utilities.Scheme lightContent(int r0) {
            com.google.android.material.color.utilities.CorePalette r0 = com.google.android.material.color.utilities.CorePalette.contentOf(r0)
            com.google.android.material.color.utilities.Scheme r0 = lightFromCorePalette(r0)
            return r0
    }

    private static com.google.android.material.color.utilities.Scheme lightFromCorePalette(com.google.android.material.color.utilities.CorePalette r6) {
            com.google.android.material.color.utilities.Scheme r0 = new com.google.android.material.color.utilities.Scheme
            r0.<init>()
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a1
            r2 = 40
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withPrimary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a1
            r3 = 100
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnPrimary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a1
            r4 = 90
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withPrimaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a1
            r5 = 10
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnPrimaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a2
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSecondary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a2
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSecondary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a2
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSecondaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a2
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSecondaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a3
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withTertiary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a3
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnTertiary(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a3
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withTertiaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.a3
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnTertiaryContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.error
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withError(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.error
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnError(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.error
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withErrorContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.error
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnErrorContainer(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            r2 = 99
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withBackground(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnBackground(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            int r1 = r1.tone(r5)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n2
            int r1 = r1.tone(r4)
            com.google.android.material.color.utilities.Scheme r0 = r0.withSurfaceVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n2
            r2 = 30
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOnSurfaceVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n2
            r2 = 50
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOutline(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n2
            r2 = 80
            int r1 = r1.tone(r2)
            com.google.android.material.color.utilities.Scheme r0 = r0.withOutlineVariant(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            r3 = 0
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withShadow(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withScrim(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            r3 = 20
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withInverseSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r1 = r6.n1
            r3 = 95
            int r1 = r1.tone(r3)
            com.google.android.material.color.utilities.Scheme r0 = r0.withInverseOnSurface(r1)
            com.google.android.material.color.utilities.TonalPalette r6 = r6.a1
            int r6 = r6.tone(r2)
            com.google.android.material.color.utilities.Scheme r6 = r0.withInversePrimary(r6)
            return r6
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.color.utilities.Scheme
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = super.equals(r5)
            if (r1 != 0) goto L11
            return r2
        L11:
            com.google.android.material.color.utilities.Scheme r5 = (com.google.android.material.color.utilities.Scheme) r5
            int r1 = r4.primary
            int r3 = r5.primary
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.onPrimary
            int r3 = r5.onPrimary
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.primaryContainer
            int r3 = r5.primaryContainer
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.onPrimaryContainer
            int r3 = r5.onPrimaryContainer
            if (r1 == r3) goto L2f
            return r2
        L2f:
            int r1 = r4.secondary
            int r3 = r5.secondary
            if (r1 == r3) goto L36
            return r2
        L36:
            int r1 = r4.onSecondary
            int r3 = r5.onSecondary
            if (r1 == r3) goto L3d
            return r2
        L3d:
            int r1 = r4.secondaryContainer
            int r3 = r5.secondaryContainer
            if (r1 == r3) goto L44
            return r2
        L44:
            int r1 = r4.onSecondaryContainer
            int r3 = r5.onSecondaryContainer
            if (r1 == r3) goto L4b
            return r2
        L4b:
            int r1 = r4.tertiary
            int r3 = r5.tertiary
            if (r1 == r3) goto L52
            return r2
        L52:
            int r1 = r4.onTertiary
            int r3 = r5.onTertiary
            if (r1 == r3) goto L59
            return r2
        L59:
            int r1 = r4.tertiaryContainer
            int r3 = r5.tertiaryContainer
            if (r1 == r3) goto L60
            return r2
        L60:
            int r1 = r4.onTertiaryContainer
            int r3 = r5.onTertiaryContainer
            if (r1 == r3) goto L67
            return r2
        L67:
            int r1 = r4.error
            int r3 = r5.error
            if (r1 == r3) goto L6e
            return r2
        L6e:
            int r1 = r4.onError
            int r3 = r5.onError
            if (r1 == r3) goto L75
            return r2
        L75:
            int r1 = r4.errorContainer
            int r3 = r5.errorContainer
            if (r1 == r3) goto L7c
            return r2
        L7c:
            int r1 = r4.onErrorContainer
            int r3 = r5.onErrorContainer
            if (r1 == r3) goto L83
            return r2
        L83:
            int r1 = r4.background
            int r3 = r5.background
            if (r1 == r3) goto L8a
            return r2
        L8a:
            int r1 = r4.onBackground
            int r3 = r5.onBackground
            if (r1 == r3) goto L91
            return r2
        L91:
            int r1 = r4.surface
            int r3 = r5.surface
            if (r1 == r3) goto L98
            return r2
        L98:
            int r1 = r4.onSurface
            int r3 = r5.onSurface
            if (r1 == r3) goto L9f
            return r2
        L9f:
            int r1 = r4.surfaceVariant
            int r3 = r5.surfaceVariant
            if (r1 == r3) goto La6
            return r2
        La6:
            int r1 = r4.onSurfaceVariant
            int r3 = r5.onSurfaceVariant
            if (r1 == r3) goto Lad
            return r2
        Lad:
            int r1 = r4.outline
            int r3 = r5.outline
            if (r1 == r3) goto Lb4
            return r2
        Lb4:
            int r1 = r4.outlineVariant
            int r3 = r5.outlineVariant
            if (r1 == r3) goto Lbb
            return r2
        Lbb:
            int r1 = r4.shadow
            int r3 = r5.shadow
            if (r1 == r3) goto Lc2
            return r2
        Lc2:
            int r1 = r4.scrim
            int r3 = r5.scrim
            if (r1 == r3) goto Lc9
            return r2
        Lc9:
            int r1 = r4.inverseSurface
            int r3 = r5.inverseSurface
            if (r1 == r3) goto Ld0
            return r2
        Ld0:
            int r1 = r4.inverseOnSurface
            int r3 = r5.inverseOnSurface
            if (r1 == r3) goto Ld7
            return r2
        Ld7:
            int r1 = r4.inversePrimary
            int r5 = r5.inversePrimary
            if (r1 == r5) goto Lde
            return r2
        Lde:
            return r0
    }

    public int getBackground() {
            r1 = this;
            int r0 = r1.background
            return r0
    }

    public int getError() {
            r1 = this;
            int r0 = r1.error
            return r0
    }

    public int getErrorContainer() {
            r1 = this;
            int r0 = r1.errorContainer
            return r0
    }

    public int getInverseOnSurface() {
            r1 = this;
            int r0 = r1.inverseOnSurface
            return r0
    }

    public int getInversePrimary() {
            r1 = this;
            int r0 = r1.inversePrimary
            return r0
    }

    public int getInverseSurface() {
            r1 = this;
            int r0 = r1.inverseSurface
            return r0
    }

    public int getOnBackground() {
            r1 = this;
            int r0 = r1.onBackground
            return r0
    }

    public int getOnError() {
            r1 = this;
            int r0 = r1.onError
            return r0
    }

    public int getOnErrorContainer() {
            r1 = this;
            int r0 = r1.onErrorContainer
            return r0
    }

    public int getOnPrimary() {
            r1 = this;
            int r0 = r1.onPrimary
            return r0
    }

    public int getOnPrimaryContainer() {
            r1 = this;
            int r0 = r1.onPrimaryContainer
            return r0
    }

    public int getOnSecondary() {
            r1 = this;
            int r0 = r1.onSecondary
            return r0
    }

    public int getOnSecondaryContainer() {
            r1 = this;
            int r0 = r1.onSecondaryContainer
            return r0
    }

    public int getOnSurface() {
            r1 = this;
            int r0 = r1.onSurface
            return r0
    }

    public int getOnSurfaceVariant() {
            r1 = this;
            int r0 = r1.onSurfaceVariant
            return r0
    }

    public int getOnTertiary() {
            r1 = this;
            int r0 = r1.onTertiary
            return r0
    }

    public int getOnTertiaryContainer() {
            r1 = this;
            int r0 = r1.onTertiaryContainer
            return r0
    }

    public int getOutline() {
            r1 = this;
            int r0 = r1.outline
            return r0
    }

    public int getOutlineVariant() {
            r1 = this;
            int r0 = r1.outlineVariant
            return r0
    }

    public int getPrimary() {
            r1 = this;
            int r0 = r1.primary
            return r0
    }

    public int getPrimaryContainer() {
            r1 = this;
            int r0 = r1.primaryContainer
            return r0
    }

    public int getScrim() {
            r1 = this;
            int r0 = r1.scrim
            return r0
    }

    public int getSecondary() {
            r1 = this;
            int r0 = r1.secondary
            return r0
    }

    public int getSecondaryContainer() {
            r1 = this;
            int r0 = r1.secondaryContainer
            return r0
    }

    public int getShadow() {
            r1 = this;
            int r0 = r1.shadow
            return r0
    }

    public int getSurface() {
            r1 = this;
            int r0 = r1.surface
            return r0
    }

    public int getSurfaceVariant() {
            r1 = this;
            int r0 = r1.surfaceVariant
            return r0
    }

    public int getTertiary() {
            r1 = this;
            int r0 = r1.tertiary
            return r0
    }

    public int getTertiaryContainer() {
            r1 = this;
            int r0 = r1.tertiaryContainer
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            int r1 = r2.primary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onPrimary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.primaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onPrimaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.secondary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onSecondary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.secondaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onSecondaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.tertiary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onTertiary
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.tertiaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onTertiaryContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.error
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onError
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.errorContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onErrorContainer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.background
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onBackground
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.surface
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onSurface
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.surfaceVariant
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.onSurfaceVariant
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.outline
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.outlineVariant
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.shadow
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.scrim
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.inverseSurface
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.inverseOnSurface
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.inversePrimary
            int r0 = r0 + r1
            return r0
    }

    public void setBackground(int r1) {
            r0 = this;
            r0.background = r1
            return
    }

    public void setError(int r1) {
            r0 = this;
            r0.error = r1
            return
    }

    public void setErrorContainer(int r1) {
            r0 = this;
            r0.errorContainer = r1
            return
    }

    public void setInverseOnSurface(int r1) {
            r0 = this;
            r0.inverseOnSurface = r1
            return
    }

    public void setInversePrimary(int r1) {
            r0 = this;
            r0.inversePrimary = r1
            return
    }

    public void setInverseSurface(int r1) {
            r0 = this;
            r0.inverseSurface = r1
            return
    }

    public void setOnBackground(int r1) {
            r0 = this;
            r0.onBackground = r1
            return
    }

    public void setOnError(int r1) {
            r0 = this;
            r0.onError = r1
            return
    }

    public void setOnErrorContainer(int r1) {
            r0 = this;
            r0.onErrorContainer = r1
            return
    }

    public void setOnPrimary(int r1) {
            r0 = this;
            r0.onPrimary = r1
            return
    }

    public void setOnPrimaryContainer(int r1) {
            r0 = this;
            r0.onPrimaryContainer = r1
            return
    }

    public void setOnSecondary(int r1) {
            r0 = this;
            r0.onSecondary = r1
            return
    }

    public void setOnSecondaryContainer(int r1) {
            r0 = this;
            r0.onSecondaryContainer = r1
            return
    }

    public void setOnSurface(int r1) {
            r0 = this;
            r0.onSurface = r1
            return
    }

    public void setOnSurfaceVariant(int r1) {
            r0 = this;
            r0.onSurfaceVariant = r1
            return
    }

    public void setOnTertiary(int r1) {
            r0 = this;
            r0.onTertiary = r1
            return
    }

    public void setOnTertiaryContainer(int r1) {
            r0 = this;
            r0.onTertiaryContainer = r1
            return
    }

    public void setOutline(int r1) {
            r0 = this;
            r0.outline = r1
            return
    }

    public void setOutlineVariant(int r1) {
            r0 = this;
            r0.outlineVariant = r1
            return
    }

    public void setPrimary(int r1) {
            r0 = this;
            r0.primary = r1
            return
    }

    public void setPrimaryContainer(int r1) {
            r0 = this;
            r0.primaryContainer = r1
            return
    }

    public void setScrim(int r1) {
            r0 = this;
            r0.scrim = r1
            return
    }

    public void setSecondary(int r1) {
            r0 = this;
            r0.secondary = r1
            return
    }

    public void setSecondaryContainer(int r1) {
            r0 = this;
            r0.secondaryContainer = r1
            return
    }

    public void setShadow(int r1) {
            r0 = this;
            r0.shadow = r1
            return
    }

    public void setSurface(int r1) {
            r0 = this;
            r0.surface = r1
            return
    }

    public void setSurfaceVariant(int r1) {
            r0 = this;
            r0.surfaceVariant = r1
            return
    }

    public void setTertiary(int r1) {
            r0 = this;
            r0.tertiary = r1
            return
    }

    public void setTertiaryContainer(int r1) {
            r0 = this;
            r0.tertiaryContainer = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Scheme{primary="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.primary
            r0.append(r1)
            java.lang.String r1 = ", onPrimary="
            r0.append(r1)
            int r1 = r3.onPrimary
            r0.append(r1)
            java.lang.String r1 = ", primaryContainer="
            r0.append(r1)
            int r1 = r3.primaryContainer
            r0.append(r1)
            java.lang.String r1 = ", onPrimaryContainer="
            r0.append(r1)
            int r1 = r3.onPrimaryContainer
            r0.append(r1)
            java.lang.String r1 = ", secondary="
            r0.append(r1)
            int r1 = r3.secondary
            r0.append(r1)
            java.lang.String r1 = ", onSecondary="
            r0.append(r1)
            int r1 = r3.onSecondary
            r0.append(r1)
            java.lang.String r1 = ", secondaryContainer="
            r0.append(r1)
            int r1 = r3.secondaryContainer
            r0.append(r1)
            java.lang.String r1 = ", onSecondaryContainer="
            r0.append(r1)
            int r1 = r3.onSecondaryContainer
            r0.append(r1)
            java.lang.String r1 = ", tertiary="
            r0.append(r1)
            int r1 = r3.tertiary
            r0.append(r1)
            java.lang.String r1 = ", onTertiary="
            r0.append(r1)
            int r1 = r3.onTertiary
            r0.append(r1)
            java.lang.String r1 = ", tertiaryContainer="
            r0.append(r1)
            int r1 = r3.tertiaryContainer
            r0.append(r1)
            java.lang.String r1 = ", onTertiaryContainer="
            r0.append(r1)
            int r1 = r3.onTertiaryContainer
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            int r1 = r3.error
            r0.append(r1)
            java.lang.String r1 = ", onError="
            r0.append(r1)
            int r1 = r3.onError
            r0.append(r1)
            java.lang.String r1 = ", errorContainer="
            r0.append(r1)
            int r1 = r3.errorContainer
            r0.append(r1)
            java.lang.String r1 = ", onErrorContainer="
            r0.append(r1)
            int r1 = r3.onErrorContainer
            r0.append(r1)
            java.lang.String r1 = ", background="
            r0.append(r1)
            int r1 = r3.background
            r0.append(r1)
            java.lang.String r1 = ", onBackground="
            r0.append(r1)
            int r1 = r3.onBackground
            r0.append(r1)
            java.lang.String r1 = ", surface="
            r0.append(r1)
            int r1 = r3.surface
            r0.append(r1)
            java.lang.String r1 = ", onSurface="
            r0.append(r1)
            int r1 = r3.onSurface
            r0.append(r1)
            java.lang.String r1 = ", surfaceVariant="
            r0.append(r1)
            int r1 = r3.surfaceVariant
            r0.append(r1)
            java.lang.String r1 = ", onSurfaceVariant="
            r0.append(r1)
            int r1 = r3.onSurfaceVariant
            r0.append(r1)
            java.lang.String r1 = ", outline="
            r0.append(r1)
            int r1 = r3.outline
            r0.append(r1)
            java.lang.String r1 = ", outlineVariant="
            r0.append(r1)
            int r1 = r3.outlineVariant
            r0.append(r1)
            java.lang.String r1 = ", shadow="
            r0.append(r1)
            int r1 = r3.shadow
            r0.append(r1)
            java.lang.String r1 = ", scrim="
            r0.append(r1)
            int r1 = r3.scrim
            r0.append(r1)
            java.lang.String r1 = ", inverseSurface="
            r0.append(r1)
            int r1 = r3.inverseSurface
            r0.append(r1)
            java.lang.String r1 = ", inverseOnSurface="
            r0.append(r1)
            int r1 = r3.inverseOnSurface
            r0.append(r1)
            java.lang.String r1 = ", inversePrimary="
            r0.append(r1)
            int r1 = r3.inversePrimary
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withBackground(int r1) {
            r0 = this;
            r0.background = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withError(int r1) {
            r0 = this;
            r0.error = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withErrorContainer(int r1) {
            r0 = this;
            r0.errorContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withInverseOnSurface(int r1) {
            r0 = this;
            r0.inverseOnSurface = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withInversePrimary(int r1) {
            r0 = this;
            r0.inversePrimary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withInverseSurface(int r1) {
            r0 = this;
            r0.inverseSurface = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnBackground(int r1) {
            r0 = this;
            r0.onBackground = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnError(int r1) {
            r0 = this;
            r0.onError = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnErrorContainer(int r1) {
            r0 = this;
            r0.onErrorContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnPrimary(int r1) {
            r0 = this;
            r0.onPrimary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnPrimaryContainer(int r1) {
            r0 = this;
            r0.onPrimaryContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnSecondary(int r1) {
            r0 = this;
            r0.onSecondary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnSecondaryContainer(int r1) {
            r0 = this;
            r0.onSecondaryContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnSurface(int r1) {
            r0 = this;
            r0.onSurface = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnSurfaceVariant(int r1) {
            r0 = this;
            r0.onSurfaceVariant = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnTertiary(int r1) {
            r0 = this;
            r0.onTertiary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOnTertiaryContainer(int r1) {
            r0 = this;
            r0.onTertiaryContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOutline(int r1) {
            r0 = this;
            r0.outline = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withOutlineVariant(int r1) {
            r0 = this;
            r0.outlineVariant = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withPrimary(int r1) {
            r0 = this;
            r0.primary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withPrimaryContainer(int r1) {
            r0 = this;
            r0.primaryContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withScrim(int r1) {
            r0 = this;
            r0.scrim = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withSecondary(int r1) {
            r0 = this;
            r0.secondary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withSecondaryContainer(int r1) {
            r0 = this;
            r0.secondaryContainer = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withShadow(int r1) {
            r0 = this;
            r0.shadow = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withSurface(int r1) {
            r0 = this;
            r0.surface = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withSurfaceVariant(int r1) {
            r0 = this;
            r0.surfaceVariant = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withTertiary(int r1) {
            r0 = this;
            r0.tertiary = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.color.utilities.Scheme withTertiaryContainer(int r1) {
            r0 = this;
            r0.tertiaryContainer = r1
            return r0
    }
}
