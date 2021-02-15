interface ApiHelperFace {

    
    fun getTicket(@Path("id") id: String)
    :Call<Ticket?>

    
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Call<TicketHistory?>

    
    fun createTicket()
    :Call<Ticket?>

    
    fun getCustomForm(@Path("slug") slug: String)
    :Call<CustomForm?>

    
    fun submitCustomForm(@Path("slug") slug: String)
    :Call<SubmitCustomFormResponse?>

    
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetParticipantsInsideVideoRoomResponse?>

    
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetTokenForVideoRoomResponse?>

    
)
