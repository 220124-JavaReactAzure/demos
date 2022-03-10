import { useParams } from "react-router";

const Param = () => {
    const {number} = useParams();
    return (
        <div>
            Your number from the route was {number}!
        </div>
    )
}

export default Param;