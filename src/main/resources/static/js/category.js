$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		// /categories/findById/?id=1
		
		var href = $(this).attr('href');
		
		$.get(href, function(category, status){
			$('#idEdit').val(category.id);
			$('#descripcionEdit').val(category.descripcion);
			$('#detalleEdit').val(category.detailes);
			$('#categoriaEdit').val(category.categoria);
		});
		
		$('#editModal').modal();	
	});
});