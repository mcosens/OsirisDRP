pro cimwin_fit_list_event, event

widget_control, event.top, get_uval=gauss_uval
widget_control, gauss_uval.base_id, get_uval=cimwin_uval
select_index=widget_info(event.id, /droplist_select)

self=*(cimwin_uval.self_ptr)

old_type=self->GetFitType()

if (old_type ne select_index) then begin 
    self->SetFitType, select_index
    self->CalcGauss, gauss_uval.base_id
endif

end
