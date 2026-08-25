package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
    private static final java.lang.String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final java.lang.String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private static final java.lang.String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    private static final java.lang.String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private static final java.lang.String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final java.lang.String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final java.lang.String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final java.lang.String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final java.lang.String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final java.lang.String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final java.lang.String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private static final java.lang.String UNIQUE_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    private static int sClickableSpanId;
    private final android.view.accessibility.AccessibilityNodeInfo mInfo;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mParentVirtualDescendantId;
    private int mVirtualDescendantId;

    /* JADX INFO: loaded from: classes3.dex */
    public static class AccessibilityActionCompat {
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_SELECTION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COLLAPSE = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CONTEXT_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COPY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CUT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DISMISS = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_CANCEL = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_DROP = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_START = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_EXPAND = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_HIDE_TOOLTIP = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_IME_ENTER = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_LONG_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_MOVE_WINDOW = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_DOWN = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_LEFT = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_RIGHT = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_UP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PASTE = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PRESS_AND_HOLD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_BACKWARD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_DOWN = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_FORWARD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_LEFT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_RIGHT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_TO_POSITION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_UP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SELECT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_PROGRESS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_SELECTION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_TEXT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_ON_SCREEN = null;

        @androidx.annotation.NonNull
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TOOLTIP = null;
        private static final java.lang.String TAG = "A11yActionCompat";
        public final java.lang.Object mAction;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final androidx.core.view.accessibility.AccessibilityViewCommand mCommand;
        private final int mId;
        private final java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;

        static {
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveHtmlArguments> r0 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveHtmlArguments.class
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveAtGranularityArguments> r1 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments.class
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 1
                r4 = 0
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 2
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 4
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SELECT = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 8
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_SELECTION = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 16
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 32
                r2.<init>(r3, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r5 = 64
                r2.<init>(r5, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r5 = 128(0x80, float:1.8E-43)
                r2.<init>(r5, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r5 = 256(0x100, float:3.59E-43)
                r2.<init>(r5, r4, r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r5 = 512(0x200, float:7.17E-43)
                r2.<init>(r5, r4, r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = r2
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 1024(0x400, float:1.435E-42)
                r1.<init>(r2, r4, r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_NEXT_HTML_ELEMENT = r1
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 2048(0x800, float:2.87E-42)
                r1.<init>(r2, r4, r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PREVIOUS_HTML_ELEMENT = r1
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 4096(0x1000, float:5.74E-42)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 8192(0x2000, float:1.148E-41)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 16384(0x4000, float:2.2959E-41)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COPY = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 32768(0x8000, float:4.5918E-41)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PASTE = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 65536(0x10000, float:9.1835E-41)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CUT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetSelectionArguments> r1 = androidx.core.view.accessibility.AccessibilityViewCommand.SetSelectionArguments.class
                r2 = 131072(0x20000, float:1.83671E-40)
                r0.<init>(r2, r4, r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_SELECTION = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 262144(0x40000, float:3.67342E-40)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 524288(0x80000, float:7.34684E-40)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 1048576(0x100000, float:1.469368E-39)
                r0.<init>(r1, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetTextArguments> r1 = androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments.class
                r2 = 2097152(0x200000, float:2.938736E-39)
                r0.<init>(r2, r4, r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_TEXT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 < r2) goto Ld9
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN
                r6 = r5
                goto Lda
            Ld9:
                r6 = r4
            Lda:
                r7 = 16908342(0x1020036, float:2.387738E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_ON_SCREEN = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto Lee
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION
                r12 = r5
                goto Lef
            Lee:
                r12 = r4
            Lef:
                r13 = 16908343(0x1020037, float:2.3877383E-38)
                r14 = 0
                r15 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$ScrollToPositionArguments> r16 = androidx.core.view.accessibility.AccessibilityViewCommand.ScrollToPositionArguments.class
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L104
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP
                r6 = r5
                goto L105
            L104:
                r6 = r4
            L105:
                r7 = 16908344(0x1020038, float:2.3877386E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L119
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT
                r12 = r5
                goto L11a
            L119:
                r12 = r4
            L11a:
                r13 = 16908345(0x1020039, float:2.387739E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L12f
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN
                r6 = r5
                goto L130
            L12f:
                r6 = r4
            L130:
                r7 = 16908346(0x102003a, float:2.3877392E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L144
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT
                r12 = r5
                goto L145
            L144:
                r12 = r4
            L145:
                r13 = 16908347(0x102003b, float:2.3877394E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r11 = 29
                if (r1 < r11) goto L15c
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP
                r6 = r5
                goto L15d
            L15c:
                r6 = r4
            L15d:
                r7 = 16908358(0x1020046, float:2.3877425E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_UP = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r11) goto L171
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN
                r13 = r5
                goto L172
            L171:
                r13 = r4
            L172:
                r14 = 16908359(0x1020047, float:2.3877428E-38)
                r15 = 0
                r16 = 0
                r17 = 0
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_DOWN = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r11) goto L188
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT
                r6 = r5
                goto L189
            L188:
                r6 = r4
            L189:
                r7 = 16908360(0x1020048, float:2.387743E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_LEFT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r11) goto L19d
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT
                r13 = r5
                goto L19e
            L19d:
                r13 = r4
            L19e:
                r14 = 16908361(0x1020049, float:2.3877434E-38)
                r15 = 0
                r16 = 0
                r17 = 0
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_RIGHT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L1b4
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK
                r6 = r2
                goto L1b5
            L1b4:
                r6 = r4
            L1b5:
                r7 = 16908348(0x102003c, float:2.3877397E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CONTEXT_CLICK = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 24
                if (r1 < r2) goto L1cb
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS
                r12 = r2
                goto L1cc
            L1cb:
                r12 = r4
            L1cc:
                r13 = 16908349(0x102003d, float:2.38774E-38)
                r14 = 0
                r15 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetProgressArguments> r16 = androidx.core.view.accessibility.AccessibilityViewCommand.SetProgressArguments.class
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 26
                if (r1 < r2) goto L1e3
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW
                r6 = r2
                goto L1e4
            L1e3:
                r6 = r4
            L1e4:
                r7 = 16908354(0x1020042, float:2.3877414E-38)
                r8 = 0
                r9 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveWindowArguments> r10 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments.class
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_MOVE_WINDOW = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 28
                if (r1 < r2) goto L1fb
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP
                r12 = r5
                goto L1fc
            L1fb:
                r12 = r4
            L1fc:
                r13 = 16908356(0x1020044, float:2.387742E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_TOOLTIP = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L211
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP
                r6 = r2
                goto L212
            L211:
                r6 = r4
            L212:
                r7 = 16908357(0x1020045, float:2.3877422E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_HIDE_TOOLTIP = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 30
                if (r1 < r2) goto L228
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD
                r12 = r5
                goto L229
            L228:
                r12 = r4
            L229:
                r13 = 16908362(0x102004a, float:2.3877436E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PRESS_AND_HOLD = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r2) goto L23e
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER
                r6 = r2
                goto L23f
            L23e:
                r6 = r4
            L23f:
                r7 = 16908372(0x1020054, float:2.3877464E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_IME_ENTER = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r3) goto L253
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START
                r12 = r2
                goto L254
            L253:
                r12 = r4
            L254:
                r13 = 16908373(0x1020055, float:2.3877467E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_START = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r3) goto L269
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP
                r6 = r2
                goto L26a
            L269:
                r6 = r4
            L26a:
                r7 = 16908374(0x1020056, float:2.387747E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_DROP = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                if (r1 < r3) goto L27e
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL
                r12 = r2
                goto L27f
            L27e:
                r12 = r4
            L27f:
                r13 = 16908375(0x1020057, float:2.3877473E-38)
                r14 = 0
                r15 = 0
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_CANCEL = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2 = 33
                if (r1 < r2) goto L294
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS
            L294:
                r6 = r4
                r7 = 16908376(0x1020058, float:2.3877476E-38)
                r8 = 0
                r9 = 0
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_TEXT_SUGGESTIONS = r0
                return
        }

        public AccessibilityActionCompat(int r7, java.lang.CharSequence r8) {
                r6 = this;
                r1 = 0
                r4 = 0
                r5 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public AccessibilityActionCompat(int r7, java.lang.CharSequence r8, androidx.core.view.accessibility.AccessibilityViewCommand r9) {
                r6 = this;
                r1 = 0
                r5 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private AccessibilityActionCompat(int r7, java.lang.CharSequence r8, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> r9) {
                r6 = this;
                r1 = 0
                r4 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public AccessibilityActionCompat(java.lang.Object r1, int r2, java.lang.CharSequence r3, androidx.core.view.accessibility.AccessibilityViewCommand r4, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> r5) {
                r0 = this;
                r0.<init>()
                r0.mId = r2
                r0.mCommand = r4
                if (r1 != 0) goto L11
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
                r1.<init>(r2, r3)
                r0.mAction = r1
                goto L13
            L11:
                r0.mAction = r1
            L13:
                r0.mViewCommandArgumentClass = r5
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat createReplacementAction(java.lang.CharSequence r8, androidx.core.view.accessibility.AccessibilityViewCommand r9) {
                r7 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r2 = r7.mId
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r5 = r7.mViewCommandArgumentClass
                r1 = 0
                r0 = r6
                r3 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                boolean r1 = r3 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat
                if (r1 != 0) goto L9
                return r0
            L9:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
                java.lang.Object r1 = r2.mAction
                if (r1 != 0) goto L14
                java.lang.Object r3 = r3.mAction
                if (r3 == 0) goto L1d
                return r0
            L14:
                java.lang.Object r3 = r3.mAction
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L1d
                return r0
            L1d:
                r3 = 1
                return r3
        }

        public int getId() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
                int r0 = r0.getId()
                return r0
        }

        public java.lang.CharSequence getLabel() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
                java.lang.CharSequence r0 = r0.getLabel()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                if (r0 == 0) goto L9
                int r0 = r0.hashCode()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean perform(android.view.View r5, android.os.Bundle r6) {
                r4 = this;
                androidx.core.view.accessibility.AccessibilityViewCommand r0 = r4.mCommand
                r1 = 0
                if (r0 == 0) goto L49
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r4.mViewCommandArgumentClass
                if (r2 == 0) goto L42
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L20
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L20
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L20
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L20
                androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments r1 = (androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments) r1     // Catch: java.lang.Exception -> L20
                r1.setBundle(r6)     // Catch: java.lang.Exception -> L1d
                r0 = r1
                goto L42
            L1d:
                r6 = move-exception
                r0 = r1
                goto L21
            L20:
                r6 = move-exception
            L21:
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r1 = r4.mViewCommandArgumentClass
                if (r1 != 0) goto L28
                java.lang.String r1 = "null"
                goto L2c
            L28:
                java.lang.String r1 = r1.getName()
            L2c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L42:
                androidx.core.view.accessibility.AccessibilityViewCommand r6 = r4.mCommand
                boolean r5 = r6.perform(r5, r0)
                return r5
            L49:
                return r1
        }
    }

    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo r0) {
                android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo r0 = r0.getExtraRenderingInfo()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isTextSelectable(android.view.accessibility.AccessibilityNodeInfo r0) {
                boolean r0 = r0.isTextSelectable()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setTextSelectable(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
                r0.setTextSelectable(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public final java.lang.Object mInfo;

        public CollectionInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int r1, int r2, boolean r3) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r3)
                r0.<init>(r1)
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int r1, int r2, boolean r3, int r4) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r3, r4)
                r0.<init>(r1)
                return r0
        }

        public int getColumnCount() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getColumnCount()
                return r0
        }

        public int getRowCount() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getRowCount()
                return r0
        }

        public int getSelectionMode() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getSelectionMode()
                return r0
        }

        public boolean isHierarchical() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                boolean r0 = r0.isHierarchical()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CollectionItemInfoCompat {
        public final java.lang.Object mInfo;

        public CollectionItemInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int r1, int r2, int r3, int r4, boolean r5) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5)
                r0.<init>(r1)
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int r1, int r2, int r3, int r4, boolean r5, boolean r6) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
                r0.<init>(r1)
                return r0
        }

        public int getColumnIndex() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getColumnIndex()
                return r0
        }

        public int getColumnSpan() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getColumnSpan()
                return r0
        }

        public int getRowIndex() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getRowIndex()
                return r0
        }

        public int getRowSpan() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getRowSpan()
                return r0
        }

        @java.lang.Deprecated
        public boolean isHeading() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                boolean r0 = r0.isHeading()
                return r0
        }

        public boolean isSelected() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                boolean r0 = r0.isSelected()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        public final java.lang.Object mInfo;

        public RangeInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat obtain(int r1, float r2, float r3, float r4) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r1, r2, r3, r4)
                r0.<init>(r1)
                return r0
        }

        public float getCurrent() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getCurrent()
                return r0
        }

        public float getMax() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getMax()
                return r0
        }

        public float getMin() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getMin()
                return r0
        }

        public int getType() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                int r0 = r0.getType()
                return r0
        }
    }

    public static final class TouchDelegateInfoCompat {
        public final android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo mInfo;

        public TouchDelegateInfoCompat(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public TouchDelegateInfoCompat(@androidx.annotation.NonNull java.util.Map<android.graphics.Region, android.view.View> r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L11
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = new android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo
                r0.<init>(r3)
                r2.mInfo = r0
                goto L14
            L11:
                r3 = 0
                r2.mInfo = r3
            L14:
                return
        }

        @androidx.annotation.Nullable
        public android.graphics.Region getRegionAt(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto Ld
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                android.graphics.Region r3 = r0.getRegionAt(r3)
                return r3
            Ld:
                r3 = 0
                return r3
        }

        @androidx.annotation.IntRange(from = 0)
        public int getRegionCount() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto Ld
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                int r0 = r0.getRegionCount()
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @androidx.annotation.Nullable
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTargetForRegion(@androidx.annotation.NonNull android.graphics.Region r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                android.view.accessibility.AccessibilityNodeInfo r3 = r0.getTargetForRegion(r3)
                if (r3 == 0) goto L13
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r3)
                return r3
            L13:
                r3 = 0
                return r3
        }
    }

    private AccessibilityNodeInfoCompat(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            r1.mVirtualDescendantId = r0
            r1.mInfo = r2
            return
    }

    @java.lang.Deprecated
    public AccessibilityNodeInfoCompat(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            r1.mVirtualDescendantId = r0
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2
            r1.mInfo = r2
            return
    }

    private void addSpanLocationToExtras(android.text.style.ClickableSpan r3, android.text.Spanned r4, int r5) {
            r2 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r1 = r4.getSpanStart(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r1 = r4.getSpanEnd(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r3 = r4.getSpanFlags(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.List r3 = r2.extrasIntList(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.add(r4)
            return
    }

    private void clearExtrasSpans() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            r0.remove(r1)
            return
    }

    private java.util.List<java.lang.Integer> extrasIntList(java.lang.String r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.util.ArrayList r0 = r0.getIntegerArrayList(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.mInfo
            android.os.Bundle r1 = r1.getExtras()
            r1.putIntegerArrayList(r3, r0)
        L1a:
            return r0
    }

    private static java.lang.String getActionSymbolicName(int r1) {
            r0 = 1
            if (r1 == r0) goto L8d
            r0 = 2
            if (r1 == r0) goto L8a
            switch(r1) {
                case 4: goto L87;
                case 8: goto L84;
                case 16: goto L81;
                case 32: goto L7e;
                case 64: goto L7b;
                case 128: goto L78;
                case 256: goto L75;
                case 512: goto L72;
                case 1024: goto L6f;
                case 2048: goto L6c;
                case 4096: goto L69;
                case 8192: goto L66;
                case 16384: goto L63;
                case 32768: goto L60;
                case 65536: goto L5d;
                case 131072: goto L5a;
                case 262144: goto L57;
                case 524288: goto L54;
                case 2097152: goto L51;
                case 16908354: goto L4e;
                default: goto L9;
            }
        L9:
            switch(r1) {
                case 16908342: goto L4b;
                case 16908343: goto L48;
                case 16908344: goto L45;
                case 16908345: goto L42;
                case 16908346: goto L3f;
                case 16908347: goto L3c;
                case 16908348: goto L39;
                case 16908349: goto L36;
                default: goto Lc;
            }
        Lc:
            switch(r1) {
                case 16908356: goto L33;
                case 16908357: goto L30;
                case 16908358: goto L2d;
                case 16908359: goto L2a;
                case 16908360: goto L27;
                case 16908361: goto L24;
                case 16908362: goto L21;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 16908372: goto L1e;
                case 16908373: goto L1b;
                case 16908374: goto L18;
                case 16908375: goto L15;
                default: goto L12;
            }
        L12:
            java.lang.String r1 = "ACTION_UNKNOWN"
            return r1
        L15:
            java.lang.String r1 = "ACTION_DRAG_CANCEL"
            return r1
        L18:
            java.lang.String r1 = "ACTION_DRAG_DROP"
            return r1
        L1b:
            java.lang.String r1 = "ACTION_DRAG_START"
            return r1
        L1e:
            java.lang.String r1 = "ACTION_IME_ENTER"
            return r1
        L21:
            java.lang.String r1 = "ACTION_PRESS_AND_HOLD"
            return r1
        L24:
            java.lang.String r1 = "ACTION_PAGE_RIGHT"
            return r1
        L27:
            java.lang.String r1 = "ACTION_PAGE_LEFT"
            return r1
        L2a:
            java.lang.String r1 = "ACTION_PAGE_DOWN"
            return r1
        L2d:
            java.lang.String r1 = "ACTION_PAGE_UP"
            return r1
        L30:
            java.lang.String r1 = "ACTION_HIDE_TOOLTIP"
            return r1
        L33:
            java.lang.String r1 = "ACTION_SHOW_TOOLTIP"
            return r1
        L36:
            java.lang.String r1 = "ACTION_SET_PROGRESS"
            return r1
        L39:
            java.lang.String r1 = "ACTION_CONTEXT_CLICK"
            return r1
        L3c:
            java.lang.String r1 = "ACTION_SCROLL_RIGHT"
            return r1
        L3f:
            java.lang.String r1 = "ACTION_SCROLL_DOWN"
            return r1
        L42:
            java.lang.String r1 = "ACTION_SCROLL_LEFT"
            return r1
        L45:
            java.lang.String r1 = "ACTION_SCROLL_UP"
            return r1
        L48:
            java.lang.String r1 = "ACTION_SCROLL_TO_POSITION"
            return r1
        L4b:
            java.lang.String r1 = "ACTION_SHOW_ON_SCREEN"
            return r1
        L4e:
            java.lang.String r1 = "ACTION_MOVE_WINDOW"
            return r1
        L51:
            java.lang.String r1 = "ACTION_SET_TEXT"
            return r1
        L54:
            java.lang.String r1 = "ACTION_COLLAPSE"
            return r1
        L57:
            java.lang.String r1 = "ACTION_EXPAND"
            return r1
        L5a:
            java.lang.String r1 = "ACTION_SET_SELECTION"
            return r1
        L5d:
            java.lang.String r1 = "ACTION_CUT"
            return r1
        L60:
            java.lang.String r1 = "ACTION_PASTE"
            return r1
        L63:
            java.lang.String r1 = "ACTION_COPY"
            return r1
        L66:
            java.lang.String r1 = "ACTION_SCROLL_BACKWARD"
            return r1
        L69:
            java.lang.String r1 = "ACTION_SCROLL_FORWARD"
            return r1
        L6c:
            java.lang.String r1 = "ACTION_PREVIOUS_HTML_ELEMENT"
            return r1
        L6f:
            java.lang.String r1 = "ACTION_NEXT_HTML_ELEMENT"
            return r1
        L72:
            java.lang.String r1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            return r1
        L75:
            java.lang.String r1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            return r1
        L78:
            java.lang.String r1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            return r1
        L7b:
            java.lang.String r1 = "ACTION_ACCESSIBILITY_FOCUS"
            return r1
        L7e:
            java.lang.String r1 = "ACTION_LONG_CLICK"
            return r1
        L81:
            java.lang.String r1 = "ACTION_CLICK"
            return r1
        L84:
            java.lang.String r1 = "ACTION_CLEAR_SELECTION"
            return r1
        L87:
            java.lang.String r1 = "ACTION_SELECT"
            return r1
        L8a:
            java.lang.String r1 = "ACTION_CLEAR_FOCUS"
            return r1
        L8d:
            java.lang.String r1 = "ACTION_FOCUS"
            return r1
    }

    private boolean getBooleanProperty(int r4) {
            r3 = this;
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            int r0 = r0.getInt(r2, r1)
            r0 = r0 & r4
            if (r0 != r4) goto L12
            r1 = 1
        L12:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.text.style.ClickableSpan[] getClickableSpans(java.lang.CharSequence r3) {
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L15
            r0 = r3
            android.text.Spanned r0 = (android.text.Spanned) r0
            r1 = 0
            int r3 = r3.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r3 = r0.getSpans(r1, r3, r2)
            android.text.style.ClickableSpan[] r3 = (android.text.style.ClickableSpan[]) r3
            return r3
        L15:
            r3 = 0
            return r3
    }

    private android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> getOrCreateSpansFromViewTags(android.view.View r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.getSpansFromViewTags(r3)
            if (r0 != 0) goto L10
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = androidx.core.R.id.tag_accessibility_clickable_spans
            r3.setTag(r1, r0)
        L10:
            return r0
    }

    private android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> getSpansFromViewTags(android.view.View r2) {
            r1 = this;
            int r0 = androidx.core.R.id.tag_accessibility_clickable_spans
            java.lang.Object r2 = r2.getTag(r0)
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            return r2
    }

    private boolean hasSpans() {
            r1 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r1.extrasIntList(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    private int idForClickableSpan(android.text.style.ClickableSpan r3, android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> r4) {
            r2 = this;
            if (r4 == 0) goto L23
            r0 = 0
        L3:
            int r1 = r4.size()
            if (r0 >= r1) goto L23
            java.lang.Object r1 = r4.valueAt(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.text.style.ClickableSpan r1 = (android.text.style.ClickableSpan) r1
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L20
            int r3 = r4.keyAt(r0)
            return r3
        L20:
            int r0 = r0 + 1
            goto L3
        L23:
            int r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.sClickableSpanId
            int r4 = r3 + 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.sClickableSpanId = r4
            return r3
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain() {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View r0, int r1) {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r0, r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    private void removeCollectedSpans(android.view.View r5) {
            r4 = this;
            android.util.SparseArray r5 = r4.getSpansFromViewTags(r5)
            if (r5 == 0) goto L3f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        Ld:
            int r3 = r5.size()
            if (r2 >= r3) goto L29
            java.lang.Object r3 = r5.valueAt(r2)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L26:
            int r2 = r2 + 1
            goto Ld
        L29:
            int r2 = r0.size()
            if (r1 >= r2) goto L3f
            java.lang.Object r2 = r0.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.remove(r2)
            int r1 = r1 + 1
            goto L29
        L3f:
            return
    }

    private void setBooleanProperty(int r6, boolean r7) {
            r5 = this;
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L17
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            r2 = 0
            int r3 = r0.getInt(r1, r2)
            int r4 = ~r6
            r3 = r3 & r4
            if (r7 == 0) goto L12
            goto L13
        L12:
            r6 = 0
        L13:
            r6 = r6 | r3
            r0.putInt(r1, r6)
        L17:
            return
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrap(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r1) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrapNonNullInstance(java.lang.Object r1) {
            if (r1 == 0) goto L8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public void addAction(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addAction(r2)
            return
    }

    public void addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.Object r2 = r2.mAction
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            r0.addAction(r2)
            return
    }

    public void addChild(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addChild(r2)
            return
    }

    public void addChild(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addChild(r2, r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addSpansToExtras(java.lang.CharSequence r6, android.view.View r7) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L43
            r5.clearExtrasSpans()
            r5.removeCollectedSpans(r7)
            android.text.style.ClickableSpan[] r0 = getClickableSpans(r6)
            if (r0 == 0) goto L43
            int r1 = r0.length
            if (r1 <= 0) goto L43
            android.os.Bundle r1 = r5.getExtras()
            int r2 = androidx.core.R.id.accessibility_action_clickable_span
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            r1.putInt(r3, r2)
            android.util.SparseArray r7 = r5.getOrCreateSpansFromViewTags(r7)
            r1 = 0
        L25:
            int r2 = r0.length
            if (r1 >= r2) goto L43
            r2 = r0[r1]
            int r2 = r5.idForClickableSpan(r2, r7)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r4 = r0[r1]
            r3.<init>(r4)
            r7.put(r2, r3)
            r3 = r0[r1]
            r4 = r6
            android.text.Spanned r4 = (android.text.Spanned) r4
            r5.addSpanLocationToExtras(r3, r4, r2)
            int r1 = r1 + 1
            goto L25
        L43:
            return
    }

    public boolean canOpenPopup() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.canOpenPopup()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            if (r2 != 0) goto Ld
            return r1
        Ld:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r5
            android.view.accessibility.AccessibilityNodeInfo r2 = r4.mInfo
            if (r2 != 0) goto L18
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.mInfo
            if (r2 == 0) goto L21
            return r1
        L18:
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.mInfo
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
            return r1
        L21:
            int r2 = r4.mVirtualDescendantId
            int r3 = r5.mVirtualDescendantId
            if (r2 == r3) goto L28
            return r1
        L28:
            int r2 = r4.mParentVirtualDescendantId
            int r5 = r5.mParentVirtualDescendantId
            if (r2 == r5) goto L2f
            return r1
        L2f:
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.mInfo
            java.util.List r5 = r1.findAccessibilityNodeInfosByText(r5)
            int r1 = r5.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r5.get(r2)
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3 = wrap(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(java.lang.String r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.util.List r3 = r0.findAccessibilityNodeInfosByViewId(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r3.next()
            android.view.accessibility.AccessibilityNodeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo) r1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = wrap(r1)
            r0.add(r1)
            goto Lf
        L23:
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.findFocus(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = wrapNonNullInstance(r2)
            return r2
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat focusSearch(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.focusSearch(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = wrapNonNullInstance(r2)
            return r2
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList() {
            r11 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.mInfo
            java.util.List r0 = r0.getActionList()
            if (r0 == 0) goto L29
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L28
            java.lang.Object r5 = r0.get(r3)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r10 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r10)
            int r3 = r3 + 1
            goto L12
        L28:
            return r1
        L29:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @java.lang.Deprecated
    public int getActions() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getActions()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.String> getAvailableExtraData() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.util.List r0 = r0.getAvailableExtraData()
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @java.lang.Deprecated
    public void getBoundsInParent(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.getBoundsInParent(r2)
            return
    }

    public void getBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.getBoundsInScreen(r2)
            return
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.getChild(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = wrapNonNullInstance(r2)
            return r2
    }

    public int getChildCount() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getChildCount()
            return r0
    }

    public java.lang.CharSequence getClassName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getClassName()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat getCollectionInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = r0.getCollectionInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat getCollectionItemInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = r0.getCollectionItemInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public int getDrawingOrder() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            int r0 = r0.getDrawingOrder()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getError() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getError()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getExtraRenderingInfo(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHintText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getHintText()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getInfo() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            return r0
    }

    public int getInputType() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getInputType()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabelFor() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getLabelFor()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabeledBy() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getLabeledBy()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public int getLiveRegion() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getLiveRegion()
            return r0
    }

    public int getMaxTextLength() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getMaxTextLength()
            return r0
    }

    public int getMovementGranularities() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getMovementGranularities()
            return r0
    }

    public java.lang.CharSequence getPackageName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getPackageName()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getPaneTitle() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getPaneTitle()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat getRangeInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = r0.getRangeInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getRoleDescription() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getStateDescription() {
            r2 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastR()
            if (r0 == 0) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getStateDescription()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.lang.CharSequence getText() {
            r10 = this;
            boolean r0 = r10.hasSpans()
            if (r0 == 0) goto L7c
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r10.extrasIntList(r0)
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.List r1 = r10.extrasIntList(r1)
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.List r2 = r10.extrasIntList(r2)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.List r3 = r10.extrasIntList(r3)
            android.text.SpannableString r4 = new android.text.SpannableString
            android.view.accessibility.AccessibilityNodeInfo r5 = r10.mInfo
            java.lang.CharSequence r5 = r5.getText()
            android.view.accessibility.AccessibilityNodeInfo r6 = r10.mInfo
            java.lang.CharSequence r6 = r6.getText()
            int r6 = r6.length()
            r7 = 0
            java.lang.String r5 = android.text.TextUtils.substring(r5, r7, r6)
            r4.<init>(r5)
        L38:
            int r5 = r0.size()
            if (r7 >= r5) goto L7b
            androidx.core.view.accessibility.AccessibilityClickableSpanCompat r5 = new androidx.core.view.accessibility.AccessibilityClickableSpanCompat
            java.lang.Object r6 = r3.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.os.Bundle r8 = r10.getExtras()
            java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            int r8 = r8.getInt(r9)
            r5.<init>(r6, r10, r8)
            java.lang.Object r6 = r0.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r8 = r1.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r2.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r4.setSpan(r5, r6, r8, r9)
            int r7 = r7 + 1
            goto L38
        L7b:
            return r4
        L7c:
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public int getTextSelectionEnd() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getTextSelectionEnd()
            return r0
    }

    public int getTextSelectionStart() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getTextSelectionStart()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getTooltipText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat getTouchDelegateInfo() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r0.getTouchDelegateInfo()
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalAfter() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L11
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getTraversalAfter()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalBefore() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L11
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getTraversalBefore()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public java.lang.String getUniqueId() {
            r2 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.String r0 = r0.getUniqueId()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public java.lang.String getViewIdResourceName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.String r0 = r0.getViewIdResourceName()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getWindow() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = r0.getWindow()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public int getWindowId() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getWindowId()
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public boolean isAccessibilityFocused() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isAccessibilityFocused()
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isCheckable()
            return r0
    }

    public boolean isChecked() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isChecked()
            return r0
    }

    public boolean isClickable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isClickable()
            return r0
    }

    public boolean isContentInvalid() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isContentInvalid()
            return r0
    }

    public boolean isContextClickable() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isContextClickable()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean isDismissable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isDismissable()
            return r0
    }

    public boolean isEditable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isEditable()
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isEnabled()
            return r0
    }

    public boolean isFocusable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isFocusable()
            return r0
    }

    public boolean isFocused() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isFocused()
            return r0
    }

    public boolean isHeading() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isHeading()
            return r0
        Ld:
            r0 = 2
            boolean r0 = r2.getBooleanProperty(r0)
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = r2.getCollectionItemInfo()
            if (r0 == 0) goto L23
            boolean r0 = r0.isHeading()
            if (r0 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    public boolean isImportantForAccessibility() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isImportantForAccessibility()
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean isLongClickable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isLongClickable()
            return r0
    }

    public boolean isMultiLine() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isMultiLine()
            return r0
    }

    public boolean isPassword() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isPassword()
            return r0
    }

    public boolean isScreenReaderFocusable() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isScreenReaderFocusable()
            return r0
        Ld:
            r0 = 1
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isScrollable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isScrollable()
            return r0
    }

    public boolean isSelected() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isSelected()
            return r0
    }

    public boolean isShowingHintText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isShowingHintText()
            return r0
        Ld:
            r0 = 4
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isTextEntryKey() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isTextEntryKey()
            return r0
        Ld:
            r0 = 8
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isTextSelectable() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.isTextSelectable(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean isVisibleToUser() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isVisibleToUser()
            return r0
    }

    public boolean performAction(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r2 = r0.performAction(r2)
            return r2
    }

    public boolean performAction(int r2, android.os.Bundle r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r2 = r0.performAction(r2, r3)
            return r2
    }

    public void recycle() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.recycle()
            return
    }

    public boolean refresh() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.refresh()
            return r0
    }

    public boolean removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.Object r2 = r2.mAction
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            boolean r2 = r0.removeAction(r2)
            return r2
    }

    public boolean removeChild(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r2 = r0.removeChild(r2)
            return r2
    }

    public boolean removeChild(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r2 = r0.removeChild(r2, r3)
            return r2
    }

    public void setAccessibilityFocused(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setAccessibilityFocused(r2)
            return
    }

    public void setAvailableExtraData(@androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setAvailableExtraData(r3)
        Lb:
            return
    }

    @java.lang.Deprecated
    public void setBoundsInParent(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setBoundsInParent(r2)
            return
    }

    public void setBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setBoundsInScreen(r2)
            return
    }

    public void setCanOpenPopup(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setCanOpenPopup(r2)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setCheckable(r2)
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setChecked(r2)
            return
    }

    public void setClassName(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setClassName(r2)
            return
    }

    public void setClickable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setClickable(r2)
            return
    }

    public void setCollectionInfo(java.lang.Object r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            if (r2 != 0) goto L6
            r2 = 0
            goto Lc
        L6:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat) r2
            java.lang.Object r2 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r2 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r2
        Lc:
            r0.setCollectionInfo(r2)
            return
    }

    public void setCollectionItemInfo(java.lang.Object r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            if (r2 != 0) goto L6
            r2 = 0
            goto Lc
        L6:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat) r2
            java.lang.Object r2 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r2 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r2
        Lc:
            r0.setCollectionItemInfo(r2)
            return
    }

    public void setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setContentDescription(r2)
            return
    }

    public void setContentInvalid(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setContentInvalid(r2)
            return
    }

    public void setContextClickable(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setContextClickable(r3)
        Lb:
            return
    }

    public void setDismissable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setDismissable(r2)
            return
    }

    public void setDrawingOrder(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setDrawingOrder(r3)
        Lb:
            return
    }

    public void setEditable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setEditable(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setEnabled(r2)
            return
    }

    public void setError(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setError(r2)
            return
    }

    public void setFocusable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setFocusable(r2)
            return
    }

    public void setFocused(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setFocused(r2)
            return
    }

    public void setHeading(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setHeading(r3)
            goto L10
        Lc:
            r0 = 2
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setHintText(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setHintText(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setImportantForAccessibility(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setImportantForAccessibility(r3)
        Lb:
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setInputType(r2)
            return
    }

    public void setLabelFor(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabelFor(r2)
            return
    }

    public void setLabelFor(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabelFor(r2, r3)
            return
    }

    public void setLabeledBy(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabeledBy(r2)
            return
    }

    public void setLabeledBy(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabeledBy(r2, r3)
            return
    }

    public void setLiveRegion(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLiveRegion(r2)
            return
    }

    public void setLongClickable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLongClickable(r2)
            return
    }

    public void setMaxTextLength(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMaxTextLength(r2)
            return
    }

    public void setMovementGranularities(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMovementGranularities(r2)
            return
    }

    public void setMultiLine(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMultiLine(r2)
            return
    }

    public void setPackageName(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setPackageName(r2)
            return
    }

    public void setPaneTitle(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setPaneTitle(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setParent(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setParent(r2)
            return
    }

    public void setParent(android.view.View r2, int r3) {
            r1 = this;
            r1.mParentVirtualDescendantId = r3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setParent(r2, r3)
            return
    }

    public void setPassword(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setPassword(r2)
            return
    }

    public void setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.Object r2 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r2
            r0.setRangeInfo(r2)
            return
    }

    public void setRoleDescription(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r0.putCharSequence(r1, r3)
            return
    }

    public void setScreenReaderFocusable(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setScreenReaderFocusable(r3)
            goto L10
        Lc:
            r0 = 1
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setScrollable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setScrollable(r2)
            return
    }

    public void setSelected(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSelected(r2)
            return
    }

    public void setShowingHintText(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setShowingHintText(r3)
            goto L10
        Lc:
            r0 = 4
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setSource(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.mVirtualDescendantId = r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSource(r2)
            return
    }

    public void setSource(android.view.View r2, int r3) {
            r1 = this;
            r1.mVirtualDescendantId = r3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSource(r2, r3)
            return
    }

    public void setStateDescription(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastR()
            if (r0 == 0) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setStateDescription(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setText(r2)
            return
    }

    public void setTextEntryKey(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTextEntryKey(r3)
            goto L11
        Lc:
            r0 = 8
            r2.setBooleanProperty(r0, r3)
        L11:
            return
    }

    public void setTextSelectable(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.setTextSelectable(r0, r3)
        Lb:
            return
    }

    public void setTextSelection(int r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTextSelection(r2, r3)
            return
    }

    public void setTooltipText(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTooltipText(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setTouchDelegateInfo(@androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r3 = r3.mInfo
            r0.setTouchDelegateInfo(r3)
        Ld:
            return
    }

    public void setTraversalAfter(android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTraversalAfter(r3)
        Lb:
            return
    }

    public void setTraversalAfter(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTraversalAfter(r3, r4)
        Lb:
            return
    }

    public void setTraversalBefore(android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTraversalBefore(r3)
        Lb:
            return
    }

    public void setTraversalBefore(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTraversalBefore(r3, r4)
        Lb:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public void setUniqueId(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setUniqueId(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            r0.putString(r1, r3)
        L17:
            return
    }

    public void setViewIdResourceName(java.lang.String r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setViewIdResourceName(r2)
            return
    }

    public void setVisibleToUser(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setVisibleToUser(r2)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.getBoundsInParent(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInParent: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r6.getBoundsInScreen(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInScreen: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r1 = "; packageName: "
            r0.append(r1)
            java.lang.CharSequence r1 = r6.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "; className: "
            r0.append(r1)
            java.lang.CharSequence r1 = r6.getClassName()
            r0.append(r1)
            java.lang.String r1 = "; text: "
            r0.append(r1)
            java.lang.CharSequence r1 = r6.getText()
            r0.append(r1)
            java.lang.String r1 = "; contentDescription: "
            r0.append(r1)
            java.lang.CharSequence r1 = r6.getContentDescription()
            r0.append(r1)
            java.lang.String r1 = "; viewId: "
            r0.append(r1)
            java.lang.String r1 = r6.getViewIdResourceName()
            r0.append(r1)
            java.lang.String r1 = "; uniqueId: "
            r0.append(r1)
            java.lang.String r1 = r6.getUniqueId()
            r0.append(r1)
            java.lang.String r1 = "; checkable: "
            r0.append(r1)
            boolean r1 = r6.isCheckable()
            r0.append(r1)
            java.lang.String r1 = "; checked: "
            r0.append(r1)
            boolean r1 = r6.isChecked()
            r0.append(r1)
            java.lang.String r1 = "; focusable: "
            r0.append(r1)
            boolean r1 = r6.isFocusable()
            r0.append(r1)
            java.lang.String r1 = "; focused: "
            r0.append(r1)
            boolean r1 = r6.isFocused()
            r0.append(r1)
            java.lang.String r1 = "; selected: "
            r0.append(r1)
            boolean r1 = r6.isSelected()
            r0.append(r1)
            java.lang.String r1 = "; clickable: "
            r0.append(r1)
            boolean r1 = r6.isClickable()
            r0.append(r1)
            java.lang.String r1 = "; longClickable: "
            r0.append(r1)
            boolean r1 = r6.isLongClickable()
            r0.append(r1)
            java.lang.String r1 = "; enabled: "
            r0.append(r1)
            boolean r1 = r6.isEnabled()
            r0.append(r1)
            java.lang.String r1 = "; password: "
            r0.append(r1)
            boolean r1 = r6.isPassword()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "; scrollable: "
            r1.append(r2)
            boolean r2 = r6.isScrollable()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "; ["
            r0.append(r1)
            java.util.List r1 = r6.getActionList()
            r2 = 0
        L115:
            int r3 = r1.size()
            if (r2 >= r3) goto L152
            java.lang.Object r3 = r1.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r4 = r3.getId()
            java.lang.String r4 = getActionSymbolicName(r4)
            java.lang.String r5 = "ACTION_UNKNOWN"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L13f
            java.lang.CharSequence r5 = r3.getLabel()
            if (r5 == 0) goto L13f
            java.lang.CharSequence r3 = r3.getLabel()
            java.lang.String r4 = r3.toString()
        L13f:
            r0.append(r4)
            int r3 = r1.size()
            int r3 = r3 + (-1)
            if (r2 == r3) goto L14f
            java.lang.String r3 = ", "
            r0.append(r3)
        L14f:
            int r2 = r2 + 1
            goto L115
        L152:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public android.view.accessibility.AccessibilityNodeInfo unwrap() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            return r0
    }
}
