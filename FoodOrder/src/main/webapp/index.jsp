<html>
<body>
<h2 style="color:red;text-align:center">Food Ordering</h2>
<form action="order" method="post" style="text-align: center; ">
     
            <div style="margin-bottom:25px">
                <label for="nameLabel">Name</label>
                <input id="name" name="name" class="form-control" type="text" /> 
            </div>
            <div style="margin-bottom:25px">
                <label for="PhoneLabel">Phone</label>
                <input id="phone" name="phone" class="form-control" type="number" /> 
            </div>
            <div style="margin-bottom:25px">
                <label for="">Address</label>
                <input  name="year" class="form-control" type="text" />
            </div>
            <div style="margin-bottom:25px">
                <label for="">Quantity</label>
                <input type="range" min="0" max="3" />
            </div>
             <div style="margin-bottom:25px">
                <select name="t1">
                <optgroup >
                <option>Select Your Order</option>
                <option>Cheez Pizza</option>
                <option>Onion Pizza</option>
                <option>Musroom Pizza</option>
                <option>Burger </option>
                <option>Chicken Burger</option>
                <option>Dosa</option>
                <option>Chicken Curry</option>
                <option>Lemon Rice</option>
                <option>Shahi Paneer</option>
                <option>Kadhai Paneer</option>
                <option>Chicken fry</option>
                </optgroup>
                </select>
            </div>
            <input type="submit" value="order ">
</form>


</body>
</html>
