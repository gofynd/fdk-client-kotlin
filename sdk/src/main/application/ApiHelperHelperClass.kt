class ApiHelperHelperClass : ApiHelperFace  {

val apiList = ApiListProvider.getApiList()


    
    override fun getTicket(@Path("id") id: String)
    :Call<Ticket?>{
        return apiList.getTicket(id= id)
    }

    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Call<TicketHistory?>{
        return apiList.createHistoryForTicket(ticket_id= ticket_id)
    }

    
    override fun createTicket()
    :Call<Ticket?>{
        return apiList.createTicket()
    }

    
    override fun getCustomForm(@Path("slug") slug: String)
    :Call<CustomForm?>{
        return apiList.getCustomForm(slug= slug)
    }

    
    override fun submitCustomForm(@Path("slug") slug: String)
    :Call<SubmitCustomFormResponse?>{
        return apiList.submitCustomForm(slug= slug)
    }

    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetParticipantsInsideVideoRoomResponse?>{
        return apiList.getParticipantsInsideVideoRoom(unique_name= unique_name)
    }

    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Call<GetTokenForVideoRoomResponse?>{
        return apiList.getTokenForVideoRoom(unique_name= unique_name)
    }

    




}