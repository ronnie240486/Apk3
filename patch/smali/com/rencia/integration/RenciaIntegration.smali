.class public final Lcom/rencia/integration/RenciaIntegration;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.field private static volatile running:Z

.method private constructor <init>()V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 5
    sget-boolean v0, Lcom/rencia/integration/RenciaIntegration;->running:Z
    if-nez v0, :cond_0
    const/4 v0, 0x1
    sput-boolean v0, Lcom/rencia/integration/RenciaIntegration;->running:Z
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    move-result-object v0
    check-cast v0, Landroid/app/Application;
    new-instance v1, Lcom/rencia/integration/RenciaLifecycle;
    invoke-direct {v1}, Lcom/rencia/integration/RenciaLifecycle;-><init>()V
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    new-instance v2, Lcom/rencia/integration/RenciaIntegration$Worker;
    invoke-direct {v2, v0}, Lcom/rencia/integration/RenciaIntegration$Worker;-><init>(Landroid/content/Context;)V
    new-instance v3, Ljava/lang/Thread;
    invoke-direct {v3, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
    const/4 v4, 0x1
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setDaemon(Z)V
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :cond_0
    return-void
.end method

.method public static sync(Landroid/content/Context;)V
    .locals 9
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v0
    if-eqz v0, :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    move-result v1
    if-lez v1, :cond_0

    const-string v1, "PREF"
    const/4 v2, 0x0
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v1
    const-string v2, "rencia_app_id"
    const-string v3, "nexus"
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    const-string v4, "https://renciaapp.manus.space/api/v5/apps/"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    const-string v4, "/config?mac="
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    const-string v4, "GET"
    const/4 v5, 0x0
    invoke-static {v3, v4, v5}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v3
    if-eqz v3, :cond_1
    invoke-static {p0, v3}, Lcom/rencia/integration/RenciaIntegration;->saveConfig(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    const-string v4, "https://renciaapp.manus.space/api/v5/heartbeat?mac="
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    sget-object v4, Lcom/flextv/livestore/apps/LTVApp;->channelName:Ljava/lang/String;
    if-eqz v4, :cond_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I
    move-result v5
    if-lez v5, :cond_2
    const-string v5, "&current_content="
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    const-string v5, "UTF-8"
    invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v4
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    const-string v4, "GET"
    const/4 v5, 0x0
    invoke-static {v3, v4, v5}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    const-string v4, "https://renciaapp.manus.space/api/v5/list-notifications?mac="
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    const-string v4, "GET"
    const/4 v5, 0x0
    invoke-static {v3, v4, v5}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v3
    if-eqz v3, :cond_0
    invoke-static {p0, v3}, Lcom/rencia/integration/RenciaIntegration;->saveNotifications(Landroid/content/Context;Ljava/lang/String;)V
    :cond_0
    return-void
.end method

.method public static getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    const-string v0, "PREF"
    const/4 v1, 0x0
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v0
    const-string v1, "mac_address"
    const-string v2, ""
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v0
    if-eqz v0, :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    move-result-object v0
    return-object v0
    :cond_0
    const-string v0, ""
    return-object v0
.end method

.method private static saveConfig(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    const-string v1, "PREF"
    const/4 v2, 0x0
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v1
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    move-result-object v1
    const-string v2, "rencia_config_json"
    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    const-string v2, "registered"
    const/4 v3, 0x1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    move-result v2
    const-string v3, "rencia_registered"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    const-string v2, "allowed"
    const/4 v3, 0x1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    move-result v2
    const-string v3, "rencia_allowed"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    const-string v2, "status"
    const-string v3, ""
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v2
    const-string v3, "rencia_status"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    const-string v2, "playlist_sync_required"
    const/4 v3, 0x0
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    move-result v2
    const-string v3, "rencia_playlist_sync_required"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    const-string v2, "active_list_number"
    const/4 v3, 0x1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    move-result v2
    const-string v3, "rencia_active_list_number"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    const-string v2, "expiration_modal_key"
    const-string v3, ""
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v2
    const-string v3, "rencia_expiration_modal_key"
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    const-string v2, "playlist_urls"
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    move-result-object v2
    if-eqz v2, :cond_0
    const-string v3, "rencia_playlist_urls"
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    move-result-object v2
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    return-void
.end method

.method private static saveNotifications(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    const-string v0, "PREF"
    const/4 v1, 0x0
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    move-result-object v0
    const-string v1, "rencia_notifications_json"
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    return-void
.end method

.method public static reportPlaybackFailure(Landroid/content/Context;I)V
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    move-result-object v0
    new-instance v1, Lcom/rencia/integration/RenciaIntegration$FailureWorker;
    invoke-direct {v1, v0, p1}, Lcom/rencia/integration/RenciaIntegration$FailureWorker;-><init>(Landroid/content/Context;I)V
    new-instance v2, Ljava/lang/Thread;
    invoke-direct {v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    return-void
.end method

.method public static reportPlaybackFailureDefault(Landroid/content/Context;)V
    .locals 3
    const-string v0, "PREF"
    const/4 v1, 0x0
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v0
    const-string v1, "rencia_active_list_number"
    const/4 v2, 0x1
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    move-result v1
    invoke-static {p0, v1}, Lcom/rencia/integration/RenciaIntegration;->reportPlaybackFailure(Landroid/content/Context;I)V
    return-void
.end method

.method public static ackNotification(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    move-result-object v0
    new-instance v1, Lcom/rencia/integration/RenciaIntegration$AckWorker;
    invoke-direct {v1, v0, p1}, Lcom/rencia/integration/RenciaIntegration$AckWorker;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    new-instance v2, Ljava/lang/Thread;
    invoke-direct {v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    return-void
.end method

.method public static isAllowed(Landroid/content/Context;)Z
    .locals 3
    const-string v0, "PREF"
    const/4 v1, 0x0
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v0
    const-string v1, "rencia_registered"
    const/4 v2, 0x0
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    move-result v1
    if-eqz v1, :cond_0
    const-string v1, "rencia_allowed"
    const/4 v2, 0x0
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    move-result v1
    return v1
    :cond_0
    const/4 v0, 0x0
    return v0
.end method

.method public static attachLogin(Landroid/app/Activity;)V
    .locals 11
    const v0, 0x7f0b03de
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :cond_0
    check-cast v0, Landroid/widget/TextView;
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v1
    new-instance v2, Ljava/lang/StringBuilder;
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    const-string v3, "MAC: "
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :cond_0
    const v0, 0x7f0b0433
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :cond_1
    check-cast v0, Landroid/widget/EditText;
    const-string v1, "USU\u00c1RIO (opcional)"
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V
    :cond_1
    const v0, 0x7f0b0432
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :cond_2
    check-cast v0, Landroid/widget/EditText;
    const-string v1, "SENHA (opcional)"
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V
    :cond_2
    const v0, 0x7f0b0431
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :cond_3
    check-cast v0, Landroid/widget/TextView;
    const-string v1, "CONECTAR / VALIDAR MAC"
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :cond_3
    new-instance v0, Lcom/rencia/integration/RenciaIntegration$LoginWorker;
    invoke-direct {v0, p0}, Lcom/rencia/integration/RenciaIntegration$LoginWorker;-><init>(Landroid/app/Activity;)V
    new-instance v1, Ljava/lang/Thread;
    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    return-void
.end method

.method public static checkUpdate(Landroid/content/Context;)V
    .locals 8
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v0
    if-eqz v0, :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    move-result v1
    if-lez v1, :cond_0
    const-string v1, "PREF"
    const/4 v2, 0x0
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v1
    const-string v2, "rencia_app_id"
    const-string v3, "nexus"
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v2
    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    const-string v4, "https://renciaapp.manus.space/api/v5/apps/"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    const-string v4, "/update?mac="
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    const-string v4, "GET"
    const/4 v5, 0x0
    invoke-static {v3, v4, v5}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v3
    if-eqz v3, :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    move-result-object v4
    const-string v5, "rencia_update_json"
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V
    :cond_0
    return-void
.end method

.method public static pollRemoteCommands(Landroid/content/Context;)V
    .locals 8
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v0
    if-eqz v0, :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    move-result v1
    if-lez v1, :cond_0
    new-instance v1, Ljava/lang/StringBuilder;
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    const-string v2, "https://renciaapp.manus.space/api/v5/remote-commands?mac="
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v1
    const-string v2, "GET"
    const/4 v3, 0x0
    invoke-static {v1, v2, v3}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    move-result-object v1
    if-eqz v1, :cond_0
    const-string v2, "PREF"
    const/4 v3, 0x0
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v2
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    move-result-object v2
    const-string v3, "rencia_remote_commands_json"
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :cond_0
    return-void
.end method

.method public static request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    :try_start_0
    new-instance v0, Ljava/net/URL;
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    move-result-object v0
    check-cast v0, Ljava/net/HttpURLConnection;
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    const/16 v1, 0x3a98
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    const/4 v1, 0x0
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
    const/4 v1, 0x1
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
    if-eqz p2, :cond_0
    const-string v1, "Content-Type"
    const-string v2, "application/json; charset=UTF-8"
    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    const/4 v1, 0x1
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    move-result-object v1
    const-string v2, "UTF-8"
    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    move-result-object v2
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    move-result v1
    const/16 v2, 0x190
    if-lt v1, v2, :cond_1
    const/16 v2, 0x258
    if-ge v1, v2, :cond_2
    :cond_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    move-result-object v2
    goto :goto_0
    :cond_2
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
    move-result-object v2
    if-eqz v2, :cond_4
    :goto_0
    const-string v3, "UTF-8"
    new-instance v4, Ljava/io/InputStreamReader;
    invoke-direct {v4, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    new-instance v5, Ljava/io/BufferedReader;
    invoke-direct {v5, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    new-instance v6, Ljava/lang/StringBuilder;
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :goto_1
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    move-result-object v7
    if-eqz v7, :cond_3
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    goto :goto_1
    :cond_3
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v0
    return-object v0
    :cond_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    const/4 v0, 0x0
    return-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    const/4 v0, 0x0
    return-object v0
.end method
