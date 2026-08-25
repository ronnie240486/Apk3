package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar extends android.widget.RelativeLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    private android.media.AudioManager mAudioManager;
    public boolean mAutoStartRecognition;
    private int mBackgroundAlpha;
    private int mBackgroundSpeechAlpha;
    private android.graphics.drawable.Drawable mBadgeDrawable;
    private android.widget.ImageView mBadgeView;
    private android.graphics.drawable.Drawable mBarBackground;
    private int mBarHeight;
    private final android.content.Context mContext;
    public final android.os.Handler mHandler;
    private java.lang.String mHint;
    private final android.view.inputmethod.InputMethodManager mInputMethodManager;
    private boolean mListening;
    private androidx.leanback.widget.SearchBar.SearchBarPermissionListener mPermissionListener;
    public boolean mRecognizing;
    public androidx.leanback.widget.SearchBar.SearchBarListener mSearchBarListener;
    public java.lang.String mSearchQuery;
    public androidx.leanback.widget.SearchEditText mSearchTextEditor;
    public android.util.SparseIntArray mSoundMap;
    public android.media.SoundPool mSoundPool;
    public androidx.leanback.widget.SpeechOrbView mSpeechOrbView;
    private androidx.leanback.widget.SpeechRecognitionCallback mSpeechRecognitionCallback;
    private android.speech.SpeechRecognizer mSpeechRecognizer;
    private final int mTextColor;
    private final int mTextColorSpeechMode;
    private final int mTextHintColor;
    private final int mTextHintColorSpeechMode;
    private java.lang.String mTitle;











    public interface SearchBarListener {
        void onKeyboardDismiss(java.lang.String r1);

        void onSearchQueryChange(java.lang.String r1);

        void onSearchQuerySubmit(java.lang.String r1);
    }

    public interface SearchBarPermissionListener {
        void requestAudioPermission();
    }

    static {
            java.lang.Class<androidx.leanback.widget.SearchBar> r0 = androidx.leanback.widget.SearchBar.class
            return
    }

    public SearchBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchBar(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r3.mHandler = r5
            r5 = 0
            r3.mAutoStartRecognition = r5
            android.util.SparseIntArray r6 = new android.util.SparseIntArray
            r6.<init>()
            r3.mSoundMap = r6
            r3.mRecognizing = r5
            r3.mContext = r4
            android.content.res.Resources r6 = r3.getResources()
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_search_bar
            r2 = 1
            r0.inflate(r1, r3, r2)
            android.content.res.Resources r0 = r3.getResources()
            int r1 = androidx.leanback.R.dimen.lb_search_bar_height
            int r0 = r0.getDimensionPixelSize(r1)
            r3.mBarHeight = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r1 = r3.mBarHeight
            r2 = -1
            r0.<init>(r2, r1)
            r1 = 10
            r0.addRule(r1, r2)
            r3.setLayoutParams(r0)
            r3.setBackgroundColor(r5)
            r3.setClipChildren(r5)
            java.lang.String r5 = ""
            r3.mSearchQuery = r5
            java.lang.String r5 = "input_method"
            java.lang.Object r5 = r4.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r5 = (android.view.inputmethod.InputMethodManager) r5
            r3.mInputMethodManager = r5
            int r5 = androidx.leanback.R.color.lb_search_bar_text_speech_mode
            int r5 = r6.getColor(r5)
            r3.mTextColorSpeechMode = r5
            int r5 = androidx.leanback.R.color.lb_search_bar_text
            int r5 = r6.getColor(r5)
            r3.mTextColor = r5
            int r5 = androidx.leanback.R.integer.lb_search_bar_speech_mode_background_alpha
            int r5 = r6.getInteger(r5)
            r3.mBackgroundSpeechAlpha = r5
            int r5 = androidx.leanback.R.integer.lb_search_bar_text_mode_background_alpha
            int r5 = r6.getInteger(r5)
            r3.mBackgroundAlpha = r5
            int r5 = androidx.leanback.R.color.lb_search_bar_hint_speech_mode
            int r5 = r6.getColor(r5)
            r3.mTextHintColorSpeechMode = r5
            int r5 = androidx.leanback.R.color.lb_search_bar_hint
            int r5 = r6.getColor(r5)
            r3.mTextHintColor = r5
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r3.mAudioManager = r4
            return
    }

    private boolean isVoiceMode() {
            r1 = this;
            androidx.leanback.widget.SpeechOrbView r0 = r1.mSpeechOrbView
            boolean r0 = r0.isFocused()
            return r0
    }

    private void loadSounds(android.content.Context r8) {
            r7 = this;
            r0 = 4
            int[] r1 = new int[r0]
            int r2 = androidx.leanback.R.raw.lb_voice_failure
            r3 = 0
            r1[r3] = r2
            int r2 = androidx.leanback.R.raw.lb_voice_open
            r4 = 1
            r1[r4] = r2
            int r2 = androidx.leanback.R.raw.lb_voice_no_input
            r5 = 2
            r1[r5] = r2
            int r2 = androidx.leanback.R.raw.lb_voice_success
            r5 = 3
            r1[r5] = r2
        L17:
            if (r3 >= r0) goto L29
            r2 = r1[r3]
            android.util.SparseIntArray r5 = r7.mSoundMap
            android.media.SoundPool r6 = r7.mSoundPool
            int r6 = r6.load(r8, r2, r4)
            r5.put(r2, r6)
            int r3 = r3 + 1
            goto L17
        L29:
            return
    }

    private void play(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            androidx.leanback.widget.SearchBar$10 r1 = new androidx.leanback.widget.SearchBar$10
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private void playSearchNoInput() {
            r1 = this;
            int r0 = androidx.leanback.R.raw.lb_voice_no_input
            r1.play(r0)
            return
    }

    private void updateHint() {
            r5 = this;
            android.content.res.Resources r0 = r5.getResources()
            int r1 = androidx.leanback.R.string.lb_search_bar_hint
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r5.mTitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3c
            boolean r0 = r5.isVoiceMode()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            android.content.res.Resources r0 = r5.getResources()
            int r3 = androidx.leanback.R.string.lb_search_bar_hint_with_title_speech
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r5.mTitle
            r2[r1] = r4
            java.lang.String r0 = r0.getString(r3, r2)
            goto L4c
        L2b:
            android.content.res.Resources r0 = r5.getResources()
            int r3 = androidx.leanback.R.string.lb_search_bar_hint_with_title
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r5.mTitle
            r2[r1] = r4
            java.lang.String r0 = r0.getString(r3, r2)
            goto L4c
        L3c:
            boolean r1 = r5.isVoiceMode()
            if (r1 == 0) goto L4c
            android.content.res.Resources r0 = r5.getResources()
            int r1 = androidx.leanback.R.string.lb_search_bar_hint_speech
            java.lang.String r0 = r0.getString(r1)
        L4c:
            r5.mHint = r0
            androidx.leanback.widget.SearchEditText r1 = r5.mSearchTextEditor
            if (r1 == 0) goto L55
            r1.setHint(r0)
        L55:
            return
    }

    public void displayCompletions(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto L29
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            android.view.inputmethod.CompletionInfo r2 = new android.view.inputmethod.CompletionInfo
            int r3 = r0.size()
            long r3 = (long) r3
            int r5 = r0.size()
            r2.<init>(r3, r5, r1)
            r0.add(r2)
            goto Lb
        L29:
            int r7 = r0.size()
            android.view.inputmethod.CompletionInfo[] r7 = new android.view.inputmethod.CompletionInfo[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            android.view.inputmethod.CompletionInfo[] r7 = (android.view.inputmethod.CompletionInfo[]) r7
            r6.displayCompletions(r7)
            return
    }

    public void displayCompletions(android.view.inputmethod.CompletionInfo[] r3) {
            r2 = this;
            android.view.inputmethod.InputMethodManager r0 = r2.mInputMethodManager
            androidx.leanback.widget.SearchEditText r1 = r2.mSearchTextEditor
            r0.displayCompletions(r1, r3)
            return
    }

    public android.graphics.drawable.Drawable getBadgeDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBadgeDrawable
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            java.lang.String r0 = r1.mHint
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }

    public final void hideNativeKeyboard() {
            r3 = this;
            android.view.inputmethod.InputMethodManager r0 = r3.mInputMethodManager
            androidx.leanback.widget.SearchEditText r1 = r3.mSearchTextEditor
            android.os.IBinder r1 = r1.getWindowToken()
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)
            return
    }

    public boolean isRecognizing() {
            r1 = this;
            boolean r0 = r1.mRecognizing
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            android.media.SoundPool r0 = new android.media.SoundPool
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.mSoundPool = r0
            android.content.Context r0 = r4.mContext
            r4.loadSounds(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r1.stopRecognition()
            android.media.SoundPool r0 = r1.mSoundPool
            r0.release()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            int r0 = androidx.leanback.R.id.lb_search_bar_items
            android.view.View r0 = r3.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r3.mBarBackground = r0
            int r0 = androidx.leanback.R.id.lb_search_text_editor
            android.view.View r0 = r3.findViewById(r0)
            androidx.leanback.widget.SearchEditText r0 = (androidx.leanback.widget.SearchEditText) r0
            r3.mSearchTextEditor = r0
            int r0 = androidx.leanback.R.id.lb_search_bar_badge
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mBadgeView = r0
            android.graphics.drawable.Drawable r1 = r3.mBadgeDrawable
            if (r1 == 0) goto L2c
            r0.setImageDrawable(r1)
        L2c:
            androidx.leanback.widget.SearchEditText r0 = r3.mSearchTextEditor
            androidx.leanback.widget.SearchBar$1 r1 = new androidx.leanback.widget.SearchBar$1
            r1.<init>(r3)
            r0.setOnFocusChangeListener(r1)
            androidx.leanback.widget.SearchBar$2 r0 = new androidx.leanback.widget.SearchBar$2
            r0.<init>(r3)
            androidx.leanback.widget.SearchEditText r1 = r3.mSearchTextEditor
            androidx.leanback.widget.SearchBar$3 r2 = new androidx.leanback.widget.SearchBar$3
            r2.<init>(r3, r0)
            r1.addTextChangedListener(r2)
            androidx.leanback.widget.SearchEditText r0 = r3.mSearchTextEditor
            androidx.leanback.widget.SearchBar$4 r1 = new androidx.leanback.widget.SearchBar$4
            r1.<init>(r3)
            r0.setOnKeyboardDismissListener(r1)
            androidx.leanback.widget.SearchEditText r0 = r3.mSearchTextEditor
            androidx.leanback.widget.SearchBar$5 r1 = new androidx.leanback.widget.SearchBar$5
            r1.<init>(r3)
            r0.setOnEditorActionListener(r1)
            androidx.leanback.widget.SearchEditText r0 = r3.mSearchTextEditor
            java.lang.String r1 = "escapeNorth,voiceDismiss"
            r0.setPrivateImeOptions(r1)
            int r0 = androidx.leanback.R.id.lb_search_bar_speech_orb
            android.view.View r0 = r3.findViewById(r0)
            androidx.leanback.widget.SpeechOrbView r0 = (androidx.leanback.widget.SpeechOrbView) r0
            r3.mSpeechOrbView = r0
            androidx.leanback.widget.SearchBar$6 r1 = new androidx.leanback.widget.SearchBar$6
            r1.<init>(r3)
            r0.setOnOrbClickedListener(r1)
            androidx.leanback.widget.SpeechOrbView r0 = r3.mSpeechOrbView
            androidx.leanback.widget.SearchBar$7 r1 = new androidx.leanback.widget.SearchBar$7
            r1.<init>(r3)
            r0.setOnFocusChangeListener(r1)
            boolean r0 = r3.hasFocus()
            r3.updateUi(r0)
            r3.updateHint()
            return
    }

    public final void playSearchFailure() {
            r1 = this;
            int r0 = androidx.leanback.R.raw.lb_voice_failure
            r1.play(r0)
            return
    }

    public final void playSearchOpen() {
            r1 = this;
            int r0 = androidx.leanback.R.raw.lb_voice_open
            r1.play(r0)
            return
    }

    public final void playSearchSuccess() {
            r1 = this;
            int r0 = androidx.leanback.R.raw.lb_voice_success
            r1.play(r0)
            return
    }

    public void setBadgeDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.mBadgeDrawable = r2
            android.widget.ImageView r0 = r1.mBadgeView
            if (r0 == 0) goto L19
            r0.setImageDrawable(r2)
            if (r2 == 0) goto L12
            android.widget.ImageView r2 = r1.mBadgeView
            r0 = 0
            r2.setVisibility(r0)
            goto L19
        L12:
            android.widget.ImageView r2 = r1.mBadgeView
            r0 = 8
            r2.setVisibility(r0)
        L19:
            return
    }

    @Override // android.view.View
    public void setNextFocusDownId(int r2) {
            r1 = this;
            androidx.leanback.widget.SpeechOrbView r0 = r1.mSpeechOrbView
            r0.setNextFocusDownId(r2)
            androidx.leanback.widget.SearchEditText r0 = r1.mSearchTextEditor
            r0.setNextFocusDownId(r2)
            return
    }

    public void setPermissionListener(androidx.leanback.widget.SearchBar.SearchBarPermissionListener r1) {
            r0 = this;
            r0.mPermissionListener = r1
            return
    }

    public void setSearchAffordanceColors(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            androidx.leanback.widget.SpeechOrbView r0 = r1.mSpeechOrbView
            if (r0 == 0) goto L7
            r0.setNotListeningOrbColors(r2)
        L7:
            return
    }

    public void setSearchAffordanceColorsInListening(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            androidx.leanback.widget.SpeechOrbView r0 = r1.mSpeechOrbView
            if (r0 == 0) goto L7
            r0.setListeningOrbColors(r2)
        L7:
            return
    }

    public void setSearchBarListener(androidx.leanback.widget.SearchBar.SearchBarListener r1) {
            r0 = this;
            r0.mSearchBarListener = r1
            return
    }

    public void setSearchQuery(java.lang.String r2) {
            r1 = this;
            r1.stopRecognition()
            androidx.leanback.widget.SearchEditText r0 = r1.mSearchTextEditor
            r0.setText(r2)
            r1.setSearchQueryInternal(r2)
            return
    }

    public void setSearchQueryInternal(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mSearchQuery
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L9
            return
        L9:
            r1.mSearchQuery = r2
            androidx.leanback.widget.SearchBar$SearchBarListener r0 = r1.mSearchBarListener
            if (r0 == 0) goto L12
            r0.onSearchQueryChange(r2)
        L12:
            return
    }

    @java.lang.Deprecated
    public void setSpeechRecognitionCallback(androidx.leanback.widget.SpeechRecognitionCallback r2) {
            r1 = this;
            r1.mSpeechRecognitionCallback = r2
            if (r2 == 0) goto L11
            android.speech.SpeechRecognizer r2 = r1.mSpeechRecognizer
            if (r2 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't have speech recognizer and request"
            r2.<init>(r0)
            throw r2
        L11:
            return
    }

    public void setSpeechRecognizer(android.speech.SpeechRecognizer r3) {
            r2 = this;
            r2.stopRecognition()
            android.speech.SpeechRecognizer r0 = r2.mSpeechRecognizer
            if (r0 == 0) goto L17
            r1 = 0
            r0.setRecognitionListener(r1)
            boolean r0 = r2.mListening
            if (r0 == 0) goto L17
            android.speech.SpeechRecognizer r0 = r2.mSpeechRecognizer
            r0.cancel()
            r0 = 0
            r2.mListening = r0
        L17:
            r2.mSpeechRecognizer = r3
            androidx.leanback.widget.SpeechRecognitionCallback r0 = r2.mSpeechRecognitionCallback
            if (r0 == 0) goto L28
            if (r3 != 0) goto L20
            goto L28
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't have speech recognizer and request"
            r3.<init>(r0)
            throw r3
        L28:
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.mTitle = r1
            r0.updateHint()
            return
    }

    public void startRecognition() {
            r4 = this;
            boolean r0 = r4.mRecognizing
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r4.hasFocus()
            if (r0 != 0) goto Le
            r4.requestFocus()
        Le:
            androidx.leanback.widget.SpeechRecognitionCallback r0 = r4.mSpeechRecognitionCallback
            java.lang.String r1 = ""
            r2 = 1
            if (r0 == 0) goto L27
            androidx.leanback.widget.SearchEditText r0 = r4.mSearchTextEditor
            r0.setText(r1)
            androidx.leanback.widget.SearchEditText r0 = r4.mSearchTextEditor
            r0.setHint(r1)
            androidx.leanback.widget.SpeechRecognitionCallback r0 = r4.mSpeechRecognitionCallback
            r0.recognizeSpeech()
            r4.mRecognizing = r2
            return
        L27:
            android.speech.SpeechRecognizer r0 = r4.mSpeechRecognizer
            if (r0 != 0) goto L2c
            return
        L2c:
            android.content.Context r0 = r4.getContext()
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            int r0 = r0.checkCallingOrSelfPermission(r3)
            if (r0 == 0) goto L4e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L46
            androidx.leanback.widget.SearchBar$SearchBarPermissionListener r0 = r4.mPermissionListener
            if (r0 == 0) goto L46
            r0.requestAudioPermission()
            return
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "android.permission.RECORD_AUDIO required for search"
            r0.<init>(r1)
            throw r0
        L4e:
            r4.mRecognizing = r2
            androidx.leanback.widget.SearchEditText r0 = r4.mSearchTextEditor
            r0.setText(r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            r0.<init>(r1)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r3 = "free_form"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "android.speech.extra.PARTIAL_RESULTS"
            r0.putExtra(r1, r2)
            android.speech.SpeechRecognizer r1 = r4.mSpeechRecognizer
            androidx.leanback.widget.SearchBar$9 r3 = new androidx.leanback.widget.SearchBar$9
            r3.<init>(r4)
            r1.setRecognitionListener(r3)
            r4.mListening = r2
            android.speech.SpeechRecognizer r1 = r4.mSpeechRecognizer
            r1.startListening(r0)
            return
    }

    public void stopRecognition() {
            r2 = this;
            boolean r0 = r2.mRecognizing
            if (r0 != 0) goto L5
            return
        L5:
            androidx.leanback.widget.SearchEditText r0 = r2.mSearchTextEditor
            java.lang.String r1 = r2.mSearchQuery
            r0.setText(r1)
            androidx.leanback.widget.SearchEditText r0 = r2.mSearchTextEditor
            java.lang.String r1 = r2.mHint
            r0.setHint(r1)
            r0 = 0
            r2.mRecognizing = r0
            androidx.leanback.widget.SpeechRecognitionCallback r1 = r2.mSpeechRecognitionCallback
            if (r1 != 0) goto L35
            android.speech.SpeechRecognizer r1 = r2.mSpeechRecognizer
            if (r1 != 0) goto L1f
            goto L35
        L1f:
            androidx.leanback.widget.SpeechOrbView r1 = r2.mSpeechOrbView
            r1.showNotListening()
            boolean r1 = r2.mListening
            if (r1 == 0) goto L2f
            android.speech.SpeechRecognizer r1 = r2.mSpeechRecognizer
            r1.cancel()
            r2.mListening = r0
        L2f:
            android.speech.SpeechRecognizer r0 = r2.mSpeechRecognizer
            r1 = 0
            r0.setRecognitionListener(r1)
        L35:
            return
    }

    public final void updateUi(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L2d
            android.graphics.drawable.Drawable r2 = r1.mBarBackground
            int r0 = r1.mBackgroundSpeechAlpha
            r2.setAlpha(r0)
            boolean r2 = r1.isVoiceMode()
            if (r2 == 0) goto L1e
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextHintColorSpeechMode
            r2.setTextColor(r0)
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextHintColorSpeechMode
            r2.setHintTextColor(r0)
            goto L42
        L1e:
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextColorSpeechMode
            r2.setTextColor(r0)
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextHintColorSpeechMode
            r2.setHintTextColor(r0)
            goto L42
        L2d:
            android.graphics.drawable.Drawable r2 = r1.mBarBackground
            int r0 = r1.mBackgroundAlpha
            r2.setAlpha(r0)
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextColor
            r2.setTextColor(r0)
            androidx.leanback.widget.SearchEditText r2 = r1.mSearchTextEditor
            int r0 = r1.mTextHintColor
            r2.setHintTextColor(r0)
        L42:
            r1.updateHint()
            return
    }
}
