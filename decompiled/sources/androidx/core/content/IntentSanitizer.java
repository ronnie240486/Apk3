package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class IntentSanitizer {
    private static final java.lang.String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
    private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
    private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
    private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
    private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
    private int mAllowedFlags;
    private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
    private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

    /* JADX INFO: renamed from: androidx.core.content.IntentSanitizer$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.Intent getSelector(android.content.Intent r0) {
                android.content.Intent r0 = r0.getSelector()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setSelector(android.content.Intent r0, android.content.Intent r1) {
                r0.setSelector(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {

        @androidx.annotation.RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.DoNotInline
            public static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
                    java.lang.String r0 = r3.getHtmlText()
                    if (r0 != 0) goto L12
                    android.content.Intent r0 = r3.getIntent()
                    if (r0 != 0) goto L12
                    android.view.textclassifier.TextLinks r0 = r3.getTextLinks()
                    if (r0 == 0) goto L2e
                L12:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "ClipData item at position "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r2 = " contains htmlText, textLinks or intent: "
                    r0.append(r2)
                    r0.append(r3)
                    java.lang.String r2 = r0.toString()
                    r4.accept(r2)
                L2e:
                    return
            }
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        private static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
                java.lang.String r0 = r3.getHtmlText()
                if (r0 != 0) goto Lc
                android.content.Intent r0 = r3.getIntent()
                if (r0 == 0) goto L28
            Lc:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ClipData item at position "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = " contains htmlText, textLinks or intent: "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                r4.accept(r2)
            L28:
                return
        }

        @androidx.annotation.DoNotInline
        public static void sanitizeClipData(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lc0
            L14:
                r9 = 0
                r0 = 0
                r1 = r0
            L17:
                int r2 = r7.getItemCount()
                if (r9 >= r2) goto Lbb
                android.content.ClipData$Item r2 = r7.getItemAt(r9)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl.checkOtherMembers(r9, r2, r12)
                goto L2e
            L2b:
                checkOtherMembers(r9, r2, r12)
            L2e:
                if (r10 == 0) goto L35
                java.lang.CharSequence r3 = r2.getText()
                goto L52
            L35:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L51
                java.lang.String r3 = "Item text cannot contain value. Item position: "
                java.lang.String r4 = ". Text: "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r3, r9, r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L51:
                r3 = r0
            L52:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L71
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L94
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r5, r9, r4)
                android.net.Uri r2 = r2.getUri()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r12.accept(r2)
                goto L94
            L71:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L96
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L82
                goto L96
            L82:
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r5, r9, r4)
                android.net.Uri r2 = r2.getUri()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r12.accept(r2)
            L94:
                r2 = r0
                goto L9a
            L96:
                android.net.Uri r2 = r2.getUri()
            L9a:
                if (r3 != 0) goto L9e
                if (r2 == 0) goto Lb7
            L9e:
                if (r1 != 0) goto Laf
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r0, r2)
                r1.<init>(r4, r5)
                goto Lb7
            Laf:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r0, r2)
                r1.addItem(r4)
            Lb7:
                int r9 = r9 + 1
                goto L17
            Lbb:
                if (r1 == 0) goto Lc0
                r8.setClipData(r1)
            Lc0:
                return
        }
    }

    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getIdentifier(android.content.Intent r0) {
                java.lang.String r0 = r0.getIdentifier()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.content.Intent setIdentifier(android.content.Intent r0, java.lang.String r1) {
                android.content.Intent r0 = r0.setIdentifier(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowClipDataText;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
        private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
        private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
        private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
        private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
        private int mAllowedFlags;
        private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
        private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

        public static /* synthetic */ boolean $r8$lambda$4U_GfrIZHjV6ewfvuClRif5BQ4U(java.lang.String r0) {
                boolean r0 = lambda$new$2(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$7_PLI9sHfa-phUU-wfc7c0K0hj4, reason: not valid java name */
        public static /* synthetic */ boolean m12$r8$lambda$7_PLI9sHfaphUUwfc7c0K0hj4(android.net.Uri r0) {
                boolean r0 = lambda$new$6(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$Eddo0m3KohqNd-vDITva-WLNd_s, reason: not valid java name */
        public static /* synthetic */ boolean m13$r8$lambda$Eddo0m3KohqNdvDITvaWLNd_s(java.lang.String r0, android.net.Uri r1) {
                boolean r0 = lambda$allowExtraOutput$16(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$FsaUUrhV33pck7xEcNErjp6-t-I, reason: not valid java name */
        public static /* synthetic */ boolean m14$r8$lambda$FsaUUrhV33pck7xEcNErjp6tI(android.content.ComponentName r0) {
                boolean r0 = lambda$allowAnyComponent$10(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$JLHq9UnD7GuE-xNJ8qTW9WH_UCM, reason: not valid java name */
        public static /* synthetic */ boolean m15$r8$lambda$JLHq9UnD7GuExNJ8qTW9WH_UCM(java.lang.String r0) {
                boolean r0 = lambda$new$0(r0)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$JqtzG9U86Ag945qpBJ8rYic8JJ4(java.lang.Object r0) {
                boolean r0 = lambda$allowExtra$14(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$KxwlvcZEZo6c-8ioUfy-JK8aiwg, reason: not valid java name */
        public static /* synthetic */ boolean m16$r8$lambda$KxwlvcZEZo6c8ioUfyJK8aiwg(java.lang.String r0, android.net.Uri r1) {
                boolean r0 = lambda$allowClipDataUriWithAuthority$11(r0, r1)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$LhhAvyYhT2VWSWan7HxDqulwnIA(java.lang.String r0) {
                boolean r0 = lambda$new$4(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$NqpErgsN-iCCwonMew-IjQVkdTQ, reason: not valid java name */
        public static /* synthetic */ boolean m17$r8$lambda$NqpErgsNiCCwonMewIjQVkdTQ(android.net.Uri r0) {
                boolean r0 = lambda$new$1(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$QGDXK6Iz77ZiVenuuvMgc-uYOdA, reason: not valid java name */
        public static /* synthetic */ boolean m18$r8$lambda$QGDXK6Iz77ZiVenuuvMgcuYOdA(java.lang.String r0) {
                boolean r0 = lambda$new$3(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$Xpt8uzicbIAL76-81iZQzx_qLWI, reason: not valid java name */
        public static /* synthetic */ boolean m19$r8$lambda$Xpt8uzicbIAL7681iZQzx_qLWI(java.lang.String r0, android.net.Uri r1) {
                boolean r0 = lambda$allowDataWithAuthority$8(r0, r1)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$eCvXo7KAaM8a9dmzzdotDaaREs8(java.lang.Object r0) {
                boolean r0 = lambda$allowExtra$12(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$eGekpZtVpL_YVf2hPyzEP-lEMe4, reason: not valid java name */
        public static /* synthetic */ boolean m20$r8$lambda$eGekpZtVpL_YVf2hPyzEPlEMe4(java.lang.String r0, android.content.ComponentName r1) {
                boolean r0 = lambda$allowComponentWithPackage$9(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$hP04n-Fqyx8Uqjz-Y2cMl4EYTQ4, reason: not valid java name */
        public static /* synthetic */ boolean m21$r8$lambda$hP04nFqyx8UqjzY2cMl4EYTQ4(java.lang.String r0, android.net.Uri r1) {
                boolean r0 = lambda$allowExtraStreamUriWithAuthority$15(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$iAMpnB3kBE20tG9-ZfpyJMElSSs, reason: not valid java name */
        public static /* synthetic */ boolean m22$r8$lambda$iAMpnB3kBE20tG9ZfpyJMElSSs(android.content.ComponentName r0) {
                boolean r0 = lambda$new$5(r0)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$mjBYkmM8ToC_lDxhzbaIvMBaWXI(java.lang.Class r0, androidx.core.util.Predicate r1, java.lang.Object r2) {
                boolean r0 = lambda$allowExtra$13(r0, r1, r2)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$u88Zh5ZHnZ5xxf_Hz5dGwcPRwzU(android.content.ClipData r0) {
                boolean r0 = lambda$new$7(r0)
                return r0
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$3
                r1.mAllowedActions = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$4
                r1.mAllowedData = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$5
                r1.mAllowedTypes = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$6
                r1.mAllowedCategories = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$7
                r1.mAllowedPackages = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$8
                r1.mAllowedComponents = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAllowedExtras = r0
                r0 = 0
                r1.mAllowClipDataText = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$9
                r1.mAllowedClipDataUri = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$10
                r1.mAllowedClipData = r0
                return
        }

        private static /* synthetic */ boolean lambda$allowAnyComponent$10(android.content.ComponentName r0) {
                r0 = 1
                return r0
        }

        private static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        private static /* synthetic */ boolean lambda$allowComponentWithPackage$9(java.lang.String r0, android.content.ComponentName r1) {
                java.lang.String r1 = r1.getPackageName()
                boolean r0 = r0.equals(r1)
                return r0
        }

        private static /* synthetic */ boolean lambda$allowDataWithAuthority$8(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        private static /* synthetic */ boolean lambda$allowExtra$12(java.lang.Object r0) {
                r0 = 1
                return r0
        }

        private static /* synthetic */ boolean lambda$allowExtra$13(java.lang.Class r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
                boolean r0 = r1.isInstance(r3)
                if (r0 == 0) goto L12
                java.lang.Object r1 = r1.cast(r3)
                boolean r1 = r2.test(r1)
                if (r1 == 0) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        private static /* synthetic */ boolean lambda$allowExtra$14(java.lang.Object r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$allowExtraOutput$16(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        private static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(java.lang.String r0, android.net.Uri r1) {
                java.lang.String r1 = r1.getAuthority()
                boolean r0 = r0.equals(r1)
                return r0
        }

        private static /* synthetic */ boolean lambda$new$0(java.lang.String r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$1(android.net.Uri r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$2(java.lang.String r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$3(java.lang.String r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$4(java.lang.String r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$5(android.content.ComponentName r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$6(android.net.Uri r0) {
                r0 = 0
                return r0
        }

        private static /* synthetic */ boolean lambda$new$7(android.content.ClipData r0) {
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAction(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedActions
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedActions = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAction(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Objects.requireNonNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 5
                r0.<init>(r3, r1)
                r2.allowAction(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowAnyComponent() {
                r1 = this;
                r0 = 1
                r1.mAllowAnyComponent = r0
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$11
                r1.mAllowedComponents = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowCategory(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedCategories
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedCategories = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowCategory(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Objects.requireNonNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 4
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowCategory(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipData(@androidx.annotation.NonNull androidx.core.util.Predicate<android.content.ClipData> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.content.ClipData> r0 = r1.mAllowedClipData
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedClipData = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataText() {
                r1 = this;
                r0 = 1
                r1.mAllowClipDataText = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataUri(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedClipDataUri
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedClipDataUri = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowClipDataUriWithAuthority(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowClipDataUri(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponent(@androidx.annotation.NonNull android.content.ComponentName r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Objects.requireNonNull(r3)
                androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowComponent(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponent(@androidx.annotation.NonNull androidx.core.util.Predicate<android.content.ComponentName> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                r0 = 1
                r1.mAllowSomeComponents = r0
                androidx.core.util.Predicate<android.content.ComponentName> r0 = r1.mAllowedComponents
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedComponents = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowComponentWithPackage(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 6
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowComponent(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowData(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedData
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedData = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowDataWithAuthority(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 7
                r0.<init>(r3, r1)
                r2.allowData(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.Object> r3) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r0 = r1.mAllowedExtras
                java.lang.Object r0 = r0.get(r2)
                androidx.core.util.Predicate r0 = (androidx.core.util.Predicate) r0
                if (r0 != 0) goto L12
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$1
            L12:
                androidx.core.util.Predicate r3 = r0.or(r3)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r0 = r1.mAllowedExtras
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
                r1 = this;
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE$2
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowExtra(r2, r3, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public <T> androidx.core.content.IntentSanitizer.Builder allowExtra(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull androidx.core.util.Predicate<T> r4) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.util.Preconditions.checkNotNull(r4)
                androidx.core.util.Predicate$$ExternalSyntheticLambda0 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda0
                r0.<init>(r3, r4)
                androidx.core.content.IntentSanitizer$Builder r2 = r1.allowExtra(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.String r1 = "output"
                r2.allowExtra(r1, r0, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r1 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r2 = 8
                r1.<init>(r4, r2)
                java.lang.String r4 = "output"
                r3.allowExtra(r4, r0, r1)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraStream(@androidx.annotation.NonNull androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.String r1 = "android.intent.extra.STREAM"
                r2.allowExtra(r1, r0, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowExtraStreamUriWithAuthority(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                androidx.core.util.Preconditions.checkNotNull(r4)
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r1 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r2 = 3
                r1.<init>(r4, r2)
                java.lang.String r4 = "android.intent.extra.STREAM"
                r3.allowExtra(r4, r0, r1)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowFlags(int r2) {
                r1 = this;
                int r0 = r1.mAllowedFlags
                r2 = r2 | r0
                r1.mAllowedFlags = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowHistoryStackFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2112614400(0x7debf000, float:3.9201841E37)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowIdentifier() {
                r1 = this;
                r0 = 1
                r1.mAllowIdentifier = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowPackage(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedPackages
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedPackages = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowPackage(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Objects.requireNonNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 2
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowPackage(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowReceiverFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2015363072(0x78200000, float:1.2980742E34)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowSelector() {
                r1 = this;
                r0 = 1
                r1.mAllowSelector = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowSourceBounds() {
                r1 = this;
                r0 = 1
                r1.mAllowSourceBounds = r0
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowType(@androidx.annotation.NonNull androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedTypes
                androidx.core.util.Predicate r2 = r0.or(r2)
                r1.mAllowedTypes = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public androidx.core.content.IntentSanitizer.Builder allowType(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.util.Objects.requireNonNull(r3)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r3, r1)
                androidx.core.content.IntentSanitizer$Builder r3 = r2.allowType(r0)
                return r3
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public androidx.core.content.IntentSanitizer build() {
                r2 = this;
                boolean r0 = r2.mAllowAnyComponent
                if (r0 == 0) goto L8
                boolean r1 = r2.mAllowSomeComponents
                if (r1 != 0) goto Lf
            L8:
                if (r0 != 0) goto L17
                boolean r0 = r2.mAllowSomeComponents
                if (r0 == 0) goto Lf
                goto L17
            Lf:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.String r1 = "You must call either allowAnyComponent or one or more of the allowComponent methods; but not both."
                r0.<init>(r1)
                throw r0
            L17:
                androidx.core.content.IntentSanitizer r0 = new androidx.core.content.IntentSanitizer
                r1 = 0
                r0.<init>(r1)
                int r1 = r2.mAllowedFlags
                androidx.core.content.IntentSanitizer.access$102(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedActions
                androidx.core.content.IntentSanitizer.access$202(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedData
                androidx.core.content.IntentSanitizer.access$302(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedTypes
                androidx.core.content.IntentSanitizer.access$402(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedCategories
                androidx.core.content.IntentSanitizer.access$502(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedPackages
                androidx.core.content.IntentSanitizer.access$602(r0, r1)
                boolean r1 = r2.mAllowAnyComponent
                androidx.core.content.IntentSanitizer.access$702(r0, r1)
                androidx.core.util.Predicate<android.content.ComponentName> r1 = r2.mAllowedComponents
                androidx.core.content.IntentSanitizer.access$802(r0, r1)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r1 = r2.mAllowedExtras
                androidx.core.content.IntentSanitizer.access$902(r0, r1)
                boolean r1 = r2.mAllowClipDataText
                androidx.core.content.IntentSanitizer.access$1002(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedClipDataUri
                androidx.core.content.IntentSanitizer.access$1102(r0, r1)
                androidx.core.util.Predicate<android.content.ClipData> r1 = r2.mAllowedClipData
                androidx.core.content.IntentSanitizer.access$1202(r0, r1)
                boolean r1 = r2.mAllowIdentifier
                androidx.core.content.IntentSanitizer.access$1302(r0, r1)
                boolean r1 = r2.mAllowSelector
                androidx.core.content.IntentSanitizer.access$1402(r0, r1)
                boolean r1 = r2.mAllowSourceBounds
                androidx.core.content.IntentSanitizer.access$1502(r0, r1)
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$NofwxHOZrEEV1MRTpUn9ROuxIY8(java.lang.String r0) {
            lambda$sanitizeByThrowing$1(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$cs9npxBvv_qtzxpDgSnPy7MmurY(java.lang.String r0) {
            lambda$sanitizeByFiltering$0(r0)
            return
    }

    private IntentSanitizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ IntentSanitizer(androidx.core.content.IntentSanitizer.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$1002(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowClipDataText = r1
            return r1
    }

    public static /* synthetic */ int access$102(androidx.core.content.IntentSanitizer r0, int r1) {
            r0.mAllowedFlags = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$1102(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipDataUri = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$1202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipData = r1
            return r1
    }

    public static /* synthetic */ boolean access$1302(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowIdentifier = r1
            return r1
    }

    public static /* synthetic */ boolean access$1402(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSelector = r1
            return r1
    }

    public static /* synthetic */ boolean access$1502(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSourceBounds = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedActions = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$302(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedData = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$402(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedTypes = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$502(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedCategories = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$602(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedPackages = r1
            return r1
    }

    public static /* synthetic */ boolean access$702(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowAnyComponent = r1
            return r1
    }

    public static /* synthetic */ androidx.core.util.Predicate access$802(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedComponents = r1
            return r1
    }

    public static /* synthetic */ java.util.Map access$902(androidx.core.content.IntentSanitizer r0, java.util.Map r1) {
            r0.mAllowedExtras = r1
            return r1
    }

    private static /* synthetic */ void lambda$sanitizeByFiltering$0(java.lang.String r0) {
            return
    }

    private static /* synthetic */ void lambda$sanitizeByThrowing$1(java.lang.String r1) {
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
    }

    private void putExtra(android.content.Intent r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            if (r4 != 0) goto Lb
            android.os.Bundle r2 = r2.getExtras()
            r4 = 0
            r2.putString(r3, r4)
            goto L28
        Lb:
            boolean r0 = r4 instanceof android.os.Parcelable
            if (r0 == 0) goto L15
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r2.putExtra(r3, r4)
            goto L28
        L15:
            boolean r0 = r4 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L1f
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            r2.putExtra(r3, r4)
            goto L28
        L1f:
            boolean r0 = r4 instanceof java.io.Serializable
            if (r0 == 0) goto L29
            java.io.Serializable r4 = (java.io.Serializable) r4
            r2.putExtra(r3, r4)
        L28:
            return
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported type "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Class r4 = r4.getClass()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitize(@androidx.annotation.NonNull android.content.Intent r9, @androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.String> r10) {
            r8 = this;
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r9.getComponent()
            boolean r1 = r8.mAllowAnyComponent
            if (r1 == 0) goto Lf
            if (r0 == 0) goto L17
        Lf:
            androidx.core.util.Predicate<android.content.ComponentName> r1 = r8.mAllowedComponents
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto L1b
        L17:
            r6.setComponent(r0)
            goto L3b
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Component is not allowed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.accept(r0)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "android"
            java.lang.String r2 = "java.lang.Void"
            r0.<init>(r1, r2)
            r6.setComponent(r0)
        L3b:
            java.lang.String r0 = r9.getPackage()
            if (r0 == 0) goto L5f
            androidx.core.util.Predicate<java.lang.String> r1 = r8.mAllowedPackages
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto L4a
            goto L5f
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Package is not allowed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.accept(r0)
            goto L62
        L5f:
            r6.setPackage(r0)
        L62:
            int r0 = r8.mAllowedFlags
            int r1 = r9.getFlags()
            r0 = r0 | r1
            int r1 = r8.mAllowedFlags
            if (r0 != r1) goto L75
            int r0 = r9.getFlags()
            r6.setFlags(r0)
            goto L9d
        L75:
            int r0 = r9.getFlags()
            r0 = r0 & r1
            r6.setFlags(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The intent contains flags that are not allowed: 0x"
            r0.append(r1)
            int r1 = r9.getFlags()
            int r2 = r8.mAllowedFlags
            int r2 = ~r2
            r1 = r1 & r2
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.accept(r0)
        L9d:
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto Lc1
            androidx.core.util.Predicate<java.lang.String> r1 = r8.mAllowedActions
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto Lac
            goto Lc1
        Lac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Action is not allowed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.accept(r0)
            goto Lc4
        Lc1:
            r6.setAction(r0)
        Lc4:
            android.net.Uri r0 = r9.getData()
            if (r0 == 0) goto Le8
            androidx.core.util.Predicate<android.net.Uri> r1 = r8.mAllowedData
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto Ld3
            goto Le8
        Ld3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Data is not allowed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.accept(r0)
            goto Leb
        Le8:
            r6.setData(r0)
        Leb:
            java.lang.String r0 = r9.getType()
            if (r0 == 0) goto L10f
            androidx.core.util.Predicate<java.lang.String> r1 = r8.mAllowedTypes
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto Lfa
            goto L10f
        Lfa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type is not allowed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.accept(r0)
            goto L116
        L10f:
            android.net.Uri r1 = r6.getData()
            r6.setDataAndType(r1, r0)
        L116:
            java.util.Set r0 = r9.getCategories()
            if (r0 == 0) goto L14d
            java.util.Iterator r0 = r0.iterator()
        L120:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.core.util.Predicate<java.lang.String> r2 = r8.mAllowedCategories
            boolean r2 = r2.test(r1)
            if (r2 == 0) goto L138
            r6.addCategory(r1)
            goto L120
        L138:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Category is not allowed: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r10.accept(r1)
            goto L120
        L14d:
            android.os.Bundle r0 = r9.getExtras()
            if (r0 == 0) goto L1c5
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L15b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "android.intent.extra.STREAM"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L17b
            int r3 = r8.mAllowedFlags
            r3 = r3 & 1
            if (r3 != 0) goto L17b
            java.lang.String r2 = "Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag."
            r10.accept(r2)
            goto L15b
        L17b:
            java.lang.String r3 = "output"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L190
            int r3 = r8.mAllowedFlags
            int r3 = ~r3
            r3 = r3 & 3
            if (r3 == 0) goto L190
            java.lang.String r2 = "Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags."
            r10.accept(r2)
            goto L15b
        L190:
            java.lang.Object r3 = r0.get(r2)
            java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r4 = r8.mAllowedExtras
            java.lang.Object r4 = r4.get(r2)
            androidx.core.util.Predicate r4 = (androidx.core.util.Predicate) r4
            if (r4 == 0) goto L1a8
            boolean r4 = r4.test(r3)
            if (r4 == 0) goto L1a8
            r8.putExtra(r6, r2, r3)
            goto L15b
        L1a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Extra is not allowed. Key: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ". Value: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r10.accept(r2)
            goto L15b
        L1c5:
            int r7 = android.os.Build.VERSION.SDK_INT
            androidx.core.util.Predicate<android.content.ClipData> r2 = r8.mAllowedClipData
            boolean r3 = r8.mAllowClipDataText
            androidx.core.util.Predicate<android.net.Uri> r4 = r8.mAllowedClipDataUri
            r0 = r9
            r1 = r6
            r5 = r10
            androidx.core.content.IntentSanitizer.Api16Impl.sanitizeClipData(r0, r1, r2, r3, r4, r5)
            r0 = 29
            if (r7 < r0) goto L1fd
            boolean r0 = r8.mAllowIdentifier
            if (r0 == 0) goto L1e3
            java.lang.String r0 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r9)
            androidx.core.content.IntentSanitizer.Api29Impl.setIdentifier(r6, r0)
            goto L1fd
        L1e3:
            java.lang.String r0 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r9)
            if (r0 == 0) goto L1fd
            java.lang.String r0 = "Identifier is not allowed: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.accept(r0)
        L1fd:
            boolean r0 = r8.mAllowSelector
            if (r0 == 0) goto L209
            android.content.Intent r0 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r9)
            androidx.core.content.IntentSanitizer.Api15Impl.setSelector(r6, r0)
            goto L223
        L209:
            android.content.Intent r0 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r9)
            if (r0 == 0) goto L223
            java.lang.String r0 = "Selector is not allowed: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            android.content.Intent r1 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.accept(r0)
        L223:
            boolean r0 = r8.mAllowSourceBounds
            if (r0 == 0) goto L22f
            android.graphics.Rect r9 = r9.getSourceBounds()
            r6.setSourceBounds(r9)
            goto L249
        L22f:
            android.graphics.Rect r0 = r9.getSourceBounds()
            if (r0 == 0) goto L249
            java.lang.String r0 = "SourceBounds is not allowed: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            android.graphics.Rect r9 = r9.getSourceBounds()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.accept(r9)
        L249:
            return r6
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitizeByFiltering(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 r0 = androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0.INSTANCE
            android.content.Intent r2 = r1.sanitize(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public android.content.Intent sanitizeByThrowing(@androidx.annotation.NonNull android.content.Intent r2) {
            r1 = this;
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 r0 = androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0.INSTANCE$1
            android.content.Intent r2 = r1.sanitize(r2, r0)
            return r2
    }
}
