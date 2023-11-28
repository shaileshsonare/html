function Sqr(props) {

    console.log(props)

    var x = props.x   

    return <div>
            {/* I am from sqr component <br/>
            Value of x is {x} <br/> */}
            Square of {x} is {x * x}
    </div>     
}

//custom attributes => properties


//CW2: Create a component <Add x={5} y={6} />
//which will print addition in following format
//5 + 6 = 11