$(document).ready(function(){
		$('.btnubah').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			
			$('#noNotaDat').val(data[0]);
			$('#tanggalTransaksiDat').val(data[1]);
			$('#hargaTotalDat').val(data[2]);
			$('#globalDiskonDat').val(data[3]);
			$('#kodeCustomerDat').val(data[4]);
			$('#kodeKaryawanDat').val(data[5]);
			
	});
		
		$('.btnubahkotaasli').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			
			$('#kodeKotaDat').val(data[0]);
			$('#namaKotaDat').val(data[1]);
			$('#kodeProvinsiDat').val(data[3]);
			
		});
		
		$('.btnubahprovinsi').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			
			$('#kodeProvinsiDat').val(data[0]);
			$('#namaProvinsiDat').val(data[1]);
			
		});
		
		$('.btnubahkaryawan').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			
			$('#kodeKaryawanDat').val(data[0]);
			$('#namaKaryawanDat').val(data[1]);
			$('#usernameDat').val(data[2]);
			$('#passwordDat').val(data[3]);
			
		});
		
		$('.btnubahcustomer').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			console.log(data);
			
			$('#kodeCust').val(data[0]);
			$('#namaCust').val(data[1]);
			$('#alamatCust').val(data[2]);
			$('#jenisKelamin').val(data[3]);
			$('#emailCust').val(data[4]);
			$('#kodeKot').val(data[6]);
			
		});
		
		$('.btnubahbarang').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			console.log(data);
			
			$('#kodeBrg').val(data[0]);
			$('#namaBrg').val(data[1]);
			$('#stokBrg').val(data[2]);
			$('#namaSup').val(data[3]);
			$('#kodeSup').val(data[4]);
			
			
		});
		
		$('.btnubahsup').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			console.log(data);
			
			$('#kodeSup').val(data[0]);
			$('#namaSup').val(data[1]);
			$('#alamatSup').val(data[2]);
			$('#telpSup').val(data[3]);
			$('#emailSup').val(data[4]);
			$('#kodeKot').val(data[6]);
			
		});

		$('.btnubahuser').on('click', function(){
			
			$('#modalUbah').modal('show');
			
			$tr = $(this).closest('tr');
			
			var data = $tr.children('td').map(function(){
				return $(this).text();
			}).get();
			
			console.log(data);
			
			$('#userIdD').val(data[0]);
			$('#usernameD').val(data[1]);
			$('#namaD').val(data[2]);
			$('#jenisKelaminD').val(data[3]);
			$('#tanggalLahirD').val(data[4]);
			$('#alamatD').val(data[5]);
			$('#noTelponD').val(data[6]);
			$('#passwordD').val(data[7]);
			
		});
		
		
});