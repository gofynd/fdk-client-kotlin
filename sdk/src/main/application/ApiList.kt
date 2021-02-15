interface ApiList{

    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    fun getTicket(@Path("id") id: String)
    :Call<Ticket?>

    
    @POST ("/service/application/lead/v1.0/ticket/{ticket_id}/history")
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Call<TicketHistory?>

    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket()
    :Call<Ticket?>

    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(@Path("slug") slug: String)
    :Call<CustomForm?>

    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(@Path("slug") slug: String)
    :Call<SubmitCustomFormResponse?>

    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetParticipantsInsideVideoRoomResponse?>

    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetTokenForVideoRoomResponse?>

    
)
